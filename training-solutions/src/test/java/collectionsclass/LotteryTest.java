package collectionsclass;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void selectWinningNumbers() {

        Lottery lottery = new Lottery(new Random(10));
        assertEquals(Arrays.asList(1, 34, 61, 64, 77), lottery.selectWinningNumbers(5, 90));
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> lottery.selectWinningNumbers(25,20));
        assertEquals("Not valid lottery!", iae.getMessage());
    }
}