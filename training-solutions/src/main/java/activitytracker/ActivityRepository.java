package activitytracker;

import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;

public class ActivityRepository {

    private MariaDbDataSource dataSource;

    public ActivityRepository(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void connect(String host, int port, String database, String user, String password) {
        try {
            dataSource.setUrl(String.format("jdbc:mariadb://%s:%d/%s?useUnicode=true", host, port, database));
            dataSource.setUser(user);
            dataSource.setPassword(password);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    public void creteTable() {
        try (Connection connection = (Connection) dataSource.getConnection();
             Statement stmt = connection.createStatement()) {
            stmt.execute("create table activities (`id` int auto_increment, `startTime` datetime," +
                    "`activity_desc` varchar(255),`activity_type` varchar(20), constraint id_auto primary key (id))");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }

    public void insert(Activity activity) {
        try (Connection connection = (Connection) dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("insert into activities (startTime, activity_desc, activity_type) values (?, ?, ?)")) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.execute();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!", sqle);
        }
    }
}