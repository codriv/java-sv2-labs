package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ElectricityTest {
    String[] streets = {"Kossuth utca", "Petőfi utca", "AranyJános utca", "Hosszú utca"};
    List<String> listOfStreetsExpected = Arrays.asList(LocalDate.now().toString(),
            "Kossuth utca", "Petőfi utca", "AranyJános utca", "Hosszú utca");
    Electricity electricity = new Electricity();

    @Test
    void getListOfStreetsTest() {
//        List<String> listOfStreetsCreated = electricity.getListOfStreets();
        List<String> listOfStreetsCreated = electricity.getListOfStreets(streets);
        assertEquals(listOfStreetsExpected, listOfStreetsCreated);
    }

    @TempDir
    File temporaryFolder;
    @Test
    void writeStreetsTest() throws IOException {
        Path path = temporaryFolder.toPath().resolve("streets.txt");
//        electricity.writeStreets(path, electricity.getListOfStreets(streets));
        electricity.writeStreets(path, listOfStreetsExpected);
        List<String> listOfStreetsCreated = Files.readAllLines(path);
        assertEquals(listOfStreetsExpected, listOfStreetsCreated);
    }
}
