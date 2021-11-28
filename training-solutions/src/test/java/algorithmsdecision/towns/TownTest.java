package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {
    Town town = new Town();
    List<Integer> habitants = Arrays.asList(4,5,8,15,25,63,98);
    int fewerThanTrueExpected = 24;
    int fewerThanFalseExpected = 3;

    @Test
    void testContainsFewerHabitants() {
        assertTrue(town.containsFewerHabitants(habitants, fewerThanTrueExpected));
        assertFalse(town.containsFewerHabitants(habitants, fewerThanFalseExpected));
    }
}