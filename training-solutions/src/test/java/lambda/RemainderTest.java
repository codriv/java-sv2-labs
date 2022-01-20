package lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {

    @Test
    void changeNumbersToRemainders() {

        Remainder remainder = new Remainder();
        List<Integer> numbers = Arrays.asList(45, 13, 64, 51, 92, 33);
        int divisor = 3;
        List<Integer> results = Arrays.asList(0, 1, 1, 0, 2, 0);
        assertEquals(results, remainder.changeNumbersToRemainders(numbers, divisor));
    }
}