package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    ActivityDao activityDao;
    Activity activity1 = new Activity(1, LocalDateTime.of(2022, 1, 10, 10, 10), "Bicikli", ActivityType.BIKING);
    Activity activity2 = new Activity(2, LocalDateTime.of(2022, 1, 20, 20, 20), "Fut", ActivityType.RUNNING);
    Activity activity3 = new Activity(3, LocalDateTime.of(2022, 2, 10, 5, 5), "Tura", ActivityType.HIKING);


    @BeforeEach
    void init() throws SQLException{
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");
        Flyway flyway = Flyway.configure().locations("filesystem:D:/nive/t360/feladatok/java-sv2-labs/training-solutions/src/test/resources/db/migration").dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
    }

    @Test
    void saveActivity() {
        activityDao.saveActivity(activity1);
        assertEquals(activity1, activityDao.listActivities().get(0));
    }

    @Test
    void findActivityById() {
        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        assertEquals(activity2, activityDao.findActivityById(2));
    }

    @Test
    void listActivities() {
        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        assertEquals(List.of(activity1, activity2, activity3), activityDao.listActivities());
    }
}