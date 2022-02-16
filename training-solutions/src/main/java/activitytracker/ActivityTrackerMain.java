
package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {

    static MariaDbDataSource dataSource = new MariaDbDataSource();

    public static void main(String[] args) {

        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.migrate();

        Activity activity1 = new Activity(1, LocalDateTime.of(2022, 1, 10, 10, 10), "Bicikli", ActivityType.BIKING);
        Activity activity2 = new Activity(2, LocalDateTime.of(2022, 1, 20, 20, 20), "Fut", ActivityType.RUNNING);
        Activity activity3 = new Activity(3, LocalDateTime.of(2022, 2, 10, 5, 5), "Tura", ActivityType.HIKING);


//        createTable(dataSource);
//        insert(dataSource, activity3);
//        System.out.println(getActivityById(2));
//        System.out.println(getActivies());

        ActivityDao activityDao = new ActivityDao(dataSource);
        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);

        System.out.println(activityDao.findActivityById(2));
        System.out.println(activityDao.listActivities());
//        activityDao.creteTable();

//        ActivityRepository ar = new ActivityRepository(dataSource);
//
//        ar.connect("localhost", 3306, "activitytracker", "root", "64o1qNpG8m");
//        ar.creteTable();
//        ar.insert(activity1);
//        ar.insert(activity2);
//        ar.insert(activity3);
//        System.out.println(ar.getActivityById(2));
//        System.out.println(ar.getActivies());
    }

    private static void createTable(MariaDbDataSource dataSource) {
        try (Connection connection = (Connection) dataSource.getConnection();
             Statement stmt = connection.createStatement()) {
            stmt.execute("create table activities (`id` int auto_increment, `startTime` datetime," +
                    "`activity_desc` varchar(255),`activity_type` varchar(20), constraint id_auto primary key (id))");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    private static void insert(MariaDbDataSource dataSource, Activity activity3) {
        try (Connection connection = (Connection) dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("insert into activities (startTime, activity_desc, activity_type) values (?, ?, ?)")) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity3.getStartTime()));
            stmt.setString(2, activity3.getDesc());
            stmt.setString(3, activity3.getType().toString());
            stmt.execute();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    public static Activity getActivityById(int id) {
        try (Connection connection = (Connection) dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("select * from activities where id = ?;")) {
            stmt.setInt(1, id);
            return getActivity(id, stmt);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    private static Activity getActivity(int id, PreparedStatement stmt) throws SQLException {
        try (ResultSet rs = stmt.executeQuery()){
            if (rs.next()) {
                return getNewActivity(rs);
            } else {
                throw new IllegalStateException("Activity with id: " + id + " not found!");
            }
        }
    }

    private static Activity getNewActivity(ResultSet rs) throws SQLException {
        int activityId = rs.getInt("id");
        LocalDateTime startTime = rs.getTimestamp("startTime").toLocalDateTime();
        String desc = rs.getString("activity_desc");
        ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
        return new Activity(activityId, startTime, desc, type);
    }

    public static List<Activity> getActivies() {
        try (Connection connection = (Connection) dataSource.getConnection();
             Statement stmt = connection.createStatement()) {
            return getActivityList(stmt);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    private static List<Activity> getActivityList(Statement stmt) throws SQLException {
        List<Activity> activityList = new ArrayList<>();
        try(ResultSet rs = stmt.executeQuery("select * from activities;")) {
            while (rs.next()) {
                activityList.add(getNewActivity(rs));
            }
        }
        return activityList;
    }
}