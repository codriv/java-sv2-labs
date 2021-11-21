package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electricity {

    private String[] arrayOfStreets;

    public Electricity(String[] arrayOfStreets) {
        this.arrayOfStreets = arrayOfStreets;
    }

    public List<String> getListOfStreets() {
        List<String> listOfStreets = new ArrayList(Arrays.asList(arrayOfStreets));
        listOfStreets.add(0, LocalDate.now().toString());
        return listOfStreets;
    }

    public void writeStreets(Path path) {
        try {
            Files.write(path, getListOfStreets());
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}