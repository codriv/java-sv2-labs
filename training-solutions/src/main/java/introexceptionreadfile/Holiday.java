package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {
    public static void main(String[] args) {
        try {
            List<String> textFile = Files.readAllLines(Paths.get("src/main/resources/introexceptionreadfile/holiday.txt"));
            System.out.println(textFile);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
