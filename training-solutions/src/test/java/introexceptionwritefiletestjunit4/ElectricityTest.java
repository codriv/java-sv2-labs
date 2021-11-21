package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.rules.TemporaryFolder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ElectricityTest {
//    List<String> streetsWithDate = Arrays.asList(LocalDate.now().toString(), "Kossuth utca",
//            "Petőfi utca", "AranyJános utca", "Hosszú utca");
//    String[] streets = streetsWithDate.subList(1, streetsWithDate.size()).toArray(String[]::new);
//    Electricity electricity = new Electricity(streets);

    String[] streets = {"Kossuth utca", "Petőfi utca", "AranyJános utca", "Hosszú utca"};
    Electricity electricity = new Electricity(streets);

    @Test
    public void getListOfStreetsTest() {
        List<String> listOfStreets = electricity.getListOfStreets();
//        assertEquals(streetsWithDate, listOfStreets);
        assertEquals(Arrays.asList(LocalDate.now().toString(), "Kossuth utca", "Petőfi utca",
                "AranyJános utca", "Hosszú utca"), listOfStreets);
    }

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();
    @Test
    public void writeStreetsTest() throws IOException {
        Path path = temporaryFolder.newFile("streets.txt").toPath();
        electricity.writeStreets(path);
        List<String> listOfStreets = Files.readAllLines(path);
        assertEquals(Arrays.asList(LocalDate.now().toString(), "Kossuth utca", "Petőfi utca",
                "AranyJános utca", "Hosszú utca"), listOfStreets);
//        assertEquals(streets, listOfStreets);
    }
}