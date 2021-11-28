package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {
    List<Trainer> trainers = Arrays.asList(
        new Trainer("Nagy Sándor", 35),
        new Trainer("Kis Mari", 28),
        new Trainer("Fekete Péter", 40),
        new Trainer("Zöld Piroska", 25)
    );
    Trainer trainerExpected = trainers.get(2);
    int ageMaxExpected = 40;
    String nameExpected = "Fekete Péter";
    MaxAgeCalculator mac = new MaxAgeCalculator();

    @Test
    void testMaxAgeCalculator() {
        Trainer trainerActual = mac.getTrainerWithMaxAge(trainers);
        assertEquals(trainerExpected, trainerActual);
        int ageMaxActual = trainerActual.getAge();
        assertEquals(ageMaxExpected, ageMaxActual);
        String nameActual = trainerActual.getName();
        assertEquals(nameExpected, nameActual);
    }
}