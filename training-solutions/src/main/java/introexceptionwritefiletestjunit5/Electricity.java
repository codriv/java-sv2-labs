package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electricity {
//    String[] streets = {"Kossuth utca", "Petőfi utca", "AranyJános utca", "Hosszú utca"};
    Path path = Paths.get("src/main/resources/introexceptionwritefile/streets.txt");

//    public List<String> getListOfStreets() {
    public List<String> getListOfStreets(String[] streets) {
//        List<String> listOfStreets = new ArrayList(this.streets);
        List<String> listOfStreets = new ArrayList(Arrays.asList(streets));
        listOfStreets.add(0, LocalDate.now().toString());
        return listOfStreets;
    }

//    public void writeStreets() {
    public void writeStreets(Path path, List<String> streets) {
        try {
//            Files.write(this.path, getListOfStreets(this.streets));
            Files.write(path, streets);
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}