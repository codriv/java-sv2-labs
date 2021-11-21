package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TrackPoints {
//    public List<String> getCoords() throws IOException {
//        return Files.readAllLines(Paths.get("src/main/resources/introexceptioncause/tracking.csv"));
//    }

    public List<String> getCoords(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void printElevations(List<String> coords) {
        for (int i = 1; i < coords.size(); i++) {
            int actual = Integer.parseInt(coords.get(i).split(";")[2]);
            int previous = Integer.parseInt(coords.get(i - 1).split(";")[2]);
            System.out.println(actual - previous);
        }
    }
}
