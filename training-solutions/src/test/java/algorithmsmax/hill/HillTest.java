package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {
    List<Integer> heights = Arrays.asList(1225, 365, 5548, 4587, 2234);
    int maxExpected = 5548;
    List<Integer> heightsFirst = Arrays.asList(6225, 1365, 2548, 4587, 5234);
    int maxFirstExpected = 6225;
    List<Integer> heightsLast = Arrays.asList(1225, 1365, 2548, 4587, 7234);
    int maxLastExpected = 7234;

    @Test
    void testHill() {
        int maxActual = new Hill().getMax(heights);
        assertEquals(maxExpected, maxActual);
        int maxFirstActual = new Hill().getMax(heightsFirst);
        assertEquals(maxFirstExpected, maxFirstActual);
        int maxLastActual = new Hill().getMax(heightsLast);
        assertEquals(maxLastExpected, maxLastActual);
    }
}