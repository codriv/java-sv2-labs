package methodoverloading;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    Time time1 = new Time(LocalTime.of(15, 30, 45));
    Time time2 = new Time(LocalTime.of(15, 30, 45));
    Time time3 = new Time(LocalTime.of(16, 20, 12));

    @Test
    void testIsEqual() {
        assertTrue(time1.isEqual(time2));
        assertTrue(time1.isEqual(15, 30, 45));
        assertTrue(time1.isEarlier(time3));
        assertTrue(time1.isEarlier(16, 20, 12));
    }
}