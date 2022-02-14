package activitytracker;

import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.MariaDbDataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ActivityRepository {

    private MariaDbDataSource dataSource;

    public ActivityRepository() {
        dataSource = new MariaDbDataSource();
    }

    public void connect(String host, int port, String database) {
        try {
            dataSource.setUrl(String.format("jdbc:mariadb://%s:%d/%s?useUnicode=true", host, port, database));
            dataSource.setUser("root");
            dataSource.setPassword("64o1qNpG8m");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    public void sqlQuery() {
        try (Connection connection = (Connection) dataSource.getConnection();
             Statement stmt = connection.createStatement()) {
            stmt.execute("create table `activities` (`id` int auto_increment, `startTime` datetime," +
                    "`activity_desc` varchar(255), `activity_type` varchar(20), constraint id_auto primary key (id))");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    public void creteTable() {
        try (Connection connection = (Connection) dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement(
                     "create table activities (`id` int auto_increment, `startTime` datetime, `activity_desc` varchar(255), `activity_type` varchar(20), constraint id_auto primary key (id))")) {
            stmt.execute();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    public void insert(Activity activity) {
        try (Connection connection = (Connection) dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("insert into activities (startTime, activity_desc, activity_type) values (?, ?, ?)")) {
            stmt.setString(1, activity.getStartTime().toString());
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.execute();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }
}