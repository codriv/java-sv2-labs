package methodparam.sums;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    Path path = Path.of("src/test/resources/methodparam/sums/floatingnumbers.txt");
    double sumPositiveExpected = 110.6;
    double sumNegativeExpected = -153.3;
    double accuracy = 0.000001;
    String floatingNumbers = getFloatingNumbers(path);

    String getFloatingNumbers(Path path) {
        String floatingNumbers = "";
        try {
            floatingNumbers = Files.readAllLines(path).get(0);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return floatingNumbers;
    }

    @Test
    void testSeparatedSum() {
        SeparatedSum separatedSum = new SeparatedSum().sum(floatingNumbers);
        double sumPositiveActual = separatedSum.getSumPositive();
        double sumNegativeActual = separatedSum.getSumNegative();
        assertEquals(sumPositiveExpected, sumPositiveActual);
        assertTrue(Math.abs(sumNegativeActual - sumNegativeExpected) < accuracy);
    }

    @Test
    void testListOfNumbers() {
        SeparatedSum separatedSum = new SeparatedSum();
        System.out.println(separatedSum.getListOfNumbers(floatingNumbers));
    }
}