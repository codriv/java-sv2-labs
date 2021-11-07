package junit5assert;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NumbresTest {
    @Test
    void testGetEvenNumbers() {
        Numbers numbers = new Numbers();
        int[] array = {2, 8, 5, 6, 2, 3, 9};
        int [] expectedArray = {2, 8, 0, 6, 2, 0, 0};
        assertArrayEquals(expectedArray, numbers.getEvenNumbers(array));
    }
}
