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
        try (org.mariadb.jdbc.Connection connection = (Connection) dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("insert into activities (startTime, activity_desc, activity_type) values (?, ?, ?)",
                     PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.execute();
            return getActivityWithGeneratedId(stmt);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert activity: " + activity.getDesc());
        }
    }

    private Activity getActivityWithGeneratedId(PreparedStatement stmt) throws SQLException {
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                int id = rs.getInt(1);
                return findActivityById(id);
            } else {
                throw new SQLException("No key has generated");
            }
        }
    }

    public Activity findActivityById(int id) {
        try (Connection connection = (Connection) dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("select * from activities where id = ?;")) {
            stmt.setInt(1, id);
            return getActivity(id, stmt);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    private Activity getActivity(int id, PreparedStatement stmt) throws SQLException {
        try (ResultSet rs = stmt.executeQuery()){
            if (rs.next()) {
                return getNewActivity(rs);
            } else {
                throw new IllegalStateException("Activity with id: " + id + " not found!");
            }
        }
    }

    private Activity getNewActivity(ResultSet rs) throws SQLException {
        int activityId = rs.getInt("id");
        LocalDateTime startTime = rs.getTimestamp("startTime").toLocalDateTime();
        String desc = rs.getString("activity_desc");
        ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
        return new Activity(activityId, startTime, desc, type);
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
        try(ResultSet rs = stmt.executeQuery("select * from activities;")) {
            while (rs.next()) {
                activityList.add(getNewActivity(rs));
            }
        }
        return activityList;
    }
}
