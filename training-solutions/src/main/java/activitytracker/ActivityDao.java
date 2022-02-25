package activitytracker;

import org.mariadb.jdbc.Connection;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void creteTable() {
        try (org.mariadb.jdbc.Connection connection = (org.mariadb.jdbc.Connection) dataSource.getConnection();
             Statement stmt = connection.createStatement()) {
            stmt.execute("create table activities (`id` int auto_increment, `startTime` datetime," +
                    "`activity_desc` varchar(255),`activity_type` varchar(20), constraint id_auto primary key (id))");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    public Activity saveActivity(Activity activity) {
        try (org.mariadb.jdbc.Connection connection = (Connection) dataSource.getConnection()) {
            connection.setAutoCommit(false);
            try (PreparedStatement stmt = connection.prepareStatement("insert into activities (startTime, activity_desc, activity_type) values (?, ?, ?)",
                    PreparedStatement.RETURN_GENERATED_KEYS)) {
                stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
                stmt.setString(2, activity.getDesc());
                stmt.setString(3, activity.getType().toString());
                stmt.execute();
                int id = getGeneratedId(stmt);
                insertTrackPoints(connection, id, activity);
                activity.setId(id);
                return activity;
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert activity: " + activity.getDesc());
        }
    }

    private void insertTrackPoints(Connection connection, int id, Activity activity) throws SQLException {
        try (PreparedStatement stmt = connection.prepareStatement("insert into track_point (time, lat, lon, activity_id) values (?, ?, ?, ?)",
                PreparedStatement.RETURN_GENERATED_KEYS)) {
            for (TrackPoint tp : activity.getTrackPoints()) {
                if (-90 > tp.getLat() || tp.getLat() > 90 || -180 > tp.getLon() || tp.getLon() > 180) {
                    connection.rollback();
                    throw new IllegalArgumentException("Invalid coordinate!");
                }
                stmt.setTimestamp(1, Timestamp.valueOf(tp.getTime()));
                stmt.setDouble(2, tp.getLat());
                stmt.setDouble(3, tp.getLon());
                stmt.setInt(4, id);
                stmt.executeQuery();
            }
            connection.commit();
        }
    }

    private int getGeneratedId(PreparedStatement stmt) throws SQLException {
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getInt(1);
            } else {
                throw new SQLException("No key has generated");
            }
        }
    }

    public Activity findActivityById(int id) {
        try (Connection connection = (Connection) dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("select * from activities where id = ?")) {
            stmt.setInt(1, id);
            return getActivity(id, stmt);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    private Activity getActivity(int id, PreparedStatement stmt) throws SQLException {
        try (ResultSet rs = stmt.executeQuery()){
            if (rs.next()) {
                return getNewActivity(rs, id);
            } else {
                throw new IllegalStateException("Activity with id: " + id + " not found!");
            }
        }
    }

    private Activity getNewActivity(ResultSet rs, int id) throws SQLException {
        int activityId = rs.getInt("id");
        LocalDateTime startTime = rs.getTimestamp("startTime").toLocalDateTime();
        String desc = rs.getString("activity_desc");
        ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
        Activity newActivity = new Activity(activityId, startTime, desc, type);
        fillTrackPointList(newActivity, id);
        return newActivity;
    }

    private void fillTrackPointList(Activity newActivity, int id) {
        try (Connection connection = (Connection) dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("select * from track_point where activity_id = ?")) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()){
                while (rs.next()) {
                    int tp_id = rs.getInt("id");
                    LocalDateTime time = rs.getTimestamp("time").toLocalDateTime();
                    double lat = rs.getDouble("lat");
                    double lon = rs.getDouble("lon");
                    newActivity.addTrackPoint(new TrackPoint(tp_id, time, lat, lon));
                }
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    public List<Activity> listActivities() {
        try (Connection connection = (Connection) dataSource.getConnection();
             Statement stmt = connection.createStatement()) {
            return getActivityList(stmt);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    private List<Activity> getActivityList(Statement stmt) throws SQLException {
        List<Activity> activityList = new ArrayList<>();
        try(ResultSet rs = stmt.executeQuery("select * from activities")) {
            while (rs.next()) {
                int id = rs.getInt("id");
                activityList.add(getNewActivity(rs, id));
            }
        }
        return activityList;
    }
}
