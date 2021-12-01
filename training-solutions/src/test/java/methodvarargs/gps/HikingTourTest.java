package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {
    FieldPoint fieldPoint1 = new FieldPoint(LocalDateTime.of(2021, 10, 20, 15,30), 45.15, 17.25);
    FieldPoint fieldPoint2 = new FieldPoint(LocalDateTime.of(2021, 10, 20, 15,35), 45.16, 17.26);
    FieldPoint fieldPoint3 = new FieldPoint(LocalDateTime.of(2021, 10, 20, 15,40), 45.17, 17.27);
    FieldPoint fieldPoint4 = new FieldPoint(LocalDateTime.of(2021, 10, 20, 15,45), 45.18, 17.28);

    LocalDateTime timeOfLogging = LocalDateTime.of(2021, 10, 25, 16, 35);

    @Test
    void testLogFieldPoints() {
        HikingTour hikingTour = new HikingTour();
        hikingTour.logFieldPoints(timeOfLogging, fieldPoint1, fieldPoint2, fieldPoint3, fieldPoint4);
        assertEquals(4, hikingTour.getFieldPoints().size());
        assertEquals(timeOfLogging, hikingTour.getFieldPoints().get(2).getTimeOfLogging());
        assertEquals(LocalDateTime.of(2021, 10, 20, 15,40), hikingTour.getFieldPoints().get(2).getTimeOfSetting());
        assertEquals(45.16, hikingTour.getFieldPoints().get(1).getLatitude());
        assertEquals(17.28, hikingTour.getFieldPoints().get(3).getLongitude());
    }
}