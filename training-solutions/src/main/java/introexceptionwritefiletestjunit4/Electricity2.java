package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electricity2 {
    private String[] streets;

    public List<String> getListOfStreets(String[] streets) {
        List<String> listOfStreets = new ArrayList(Arrays.asList(streets));
        listOfStreets.add(0, LocalDate.now().toString());
        return listOfStreets;
    }

    public void writeStreets(Path path) {
        try {
            Files.write(path, getListOfStreets(streets));
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}