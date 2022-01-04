package exception.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersSumTest {

    int[] numbers = {1,2,3,4,5,6};
    int[] numbersNull = null;
    String[] numberString = {"1", "2", "3", "4", "5", "6"};
    String[] numberStringWrong = {"1", "2", "a", "4", "5", "6"};
    String[] numberStringNull = null;
    NumbersSum numbersSum = new NumbersSum();

    @Test
    void getSumTest() {
        assertEquals(21, numbersSum.getSum(numbers));
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numbersNull));
        assertEquals("Parameter is null!", iae.getMessage());
    }

    @Test
    void testGetSum() {
        assertEquals(21, numbersSum.getSum(numberString));
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numberStringNull));
        assertEquals("Parameter is null!", iae.getMessage());
        IllegalArgumentException iae2 = assertThrows(IllegalArgumentException.class,
                () -> numbersSum.getSum(numberStringWrong));
        assertEquals("Not a number!", iae2.getMessage());
    }
}