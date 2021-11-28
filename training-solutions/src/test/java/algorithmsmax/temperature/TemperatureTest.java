package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    List<Integer> temperatures = Arrays.asList(25,23,20,15,28,30,18);
    int minExpected = 15;
    List<Integer> temperaturesFirst = Arrays.asList(5,23,20,15,28,30,18);
    int minFirstExpected = 5;
    List<Integer> temperaturesLast = Arrays.asList(25,23,20,15,28,30,8);
    int minLastExpected = 8;

    @Test
    void testGetMin() {
        int minActual = new Temperature().getMin(temperatures);
        assertEquals(minExpected, minActual);
        int minFirstActual = new Temperature().getMin(temperaturesFirst);
        assertEquals(minFirstExpected, minFirstActual);
        int minLastActual = new Temperature().getMin(temperaturesLast);
        assertEquals(minLastExpected, minLastActual);
    }
}