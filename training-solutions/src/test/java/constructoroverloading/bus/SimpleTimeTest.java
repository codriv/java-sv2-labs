package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    SimpleTime simpleTime = new SimpleTime(15, 30);
    SimpleTime simpleTime2 = new SimpleTime(16, 25);

    @Test
    void testGetDifference() {
        System.out.println(simpleTime.getDifference(simpleTime2));
    }

    @Test
    void testToString() {
        System.out.println(simpleTime);
    }
}