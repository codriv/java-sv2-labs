package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    private List<String> names = Arrays.asList("Pápoc", "Knyeri", "Csönge", "Ostffyasszonyfa");
    Path path = Paths.get("names.txt");
    public static void main(String[] args) {
        RoadMap roadMap = new RoadMap();
        try {
            Files.write(roadMap.path, roadMap.names);
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
