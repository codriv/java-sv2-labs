package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    ActivityDao activityDao;
    Activity activity1 = new Activity(1, LocalDateTime.of(2022, 1, 10, 10, 10), "Bicikli", ActivityType.BIKING);
    Activity activity2 = new Activity(2, LocalDateTime.of(2022, 1, 20, 20, 20), "Fut", ActivityType.RUNNING);
    Activity activity3 = new Activity(3, LocalDateTime.of(2022, 2, 10, 5, 5), "Tura", ActivityType.HIKING);


    @BeforeEach
    void init() throws SQLException{
        activity1.addTrackPoint(new TrackPoint(1, LocalDateTime.of(2022, 1, 10, 10, 10), 47.30, 17.30));
        activity1.addTrackPoint(new TrackPoint(2, LocalDateTime.of(2022, 1, 10, 10, 12), 47.31, 17.31));
        activity1.addTrackPoint(new TrackPoint(3, LocalDateTime.of(2022, 1, 10, 10, 13), 47.32, 17.32));
        activity2.addTrackPoint(new TrackPoint(1, LocalDateTime.of(2022, 1, 11, 10, 10), 47.40, 17.40));
        activity2.addTrackPoint(new TrackPoint(2, LocalDateTime.of(2022, 1, 11, 10, 12), 47.41, 17.41));
        activity2.addTrackPoint(new TrackPoint(3, LocalDateTime.of(2022, 1, 11, 10, 13), 47.42, 17.42));
        activity3.addTrackPoint(new TrackPoint(1, LocalDateTime.of(2022, 1, 12, 10, 10), 47.50, 17.50));
        activity3.addTrackPoint(new TrackPoint(2, LocalDateTime.of(2022, 1, 13, 10, 12), 47.51, 17.51));
        activity3.addTrackPoint(new TrackPoint(3, LocalDateTime.of(2022, 1, 13, 10, 13), 47.52, 17.52));

        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
//        Flyway flyway = Flyway.configure().locations("filesystem:D:/nive/t360/feladatok/java-sv2-labs/training-solutions/src/test/resources/db/migration").dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
    }

    @Test
    void saveActivity() {
        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        assertEquals(3, activityDao.listActivities().size());
        assertEquals(activity1, activityDao.listActivities().get(0));
    }

    @Test
    void saveActivityReturnGeneratedId() {
        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        assertEquals(3, activityDao.saveActivity(activity3).getId());
    }

    @Test
    void findActivityById() {
        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        assertEquals(activity2, activityDao.findActivityById(2));
        assertEquals(ActivityType.RUNNING, activityDao.findActivityById(2).getType());
    }

    @Test
    void saveActivityWrongCoordinate() {
        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activity3.addTrackPoint(new TrackPoint(LocalDateTime.of(2022, 1, 13, 10, 13), 47.52, 17.52));
        activity3.addTrackPoint(new TrackPoint(LocalDateTime.of(2022, 1, 13, 10, 13), 47.52, 17.52));
        activity3.addTrackPoint(new TrackPoint(LocalDateTime.of(2022, 1, 13, 10, 13), 95.52, 17.52));
        activity3.addTrackPoint(new TrackPoint(LocalDateTime.of(2022, 1, 13, 10, 13), 47.52, 17.52));
        activity3.addTrackPoint(new TrackPoint(LocalDateTime.of(2022, 1, 13, 10, 13), 47.52, 17.52));
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> activityDao.saveActivity(activity3));
        assertEquals(2, activityDao.listActivities().size());
    }

    @Test
    void listActivities() {
        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        assertEquals(List.of(activity1, activity2, activity3), activityDao.listActivities());
    }
}