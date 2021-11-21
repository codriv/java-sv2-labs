package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {
    private String filePath = "src/main/resources/introexceptioncheckedtrace/neptun.csv";
    private List<String> neptunCodes = new ArrayList<>();

    private List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    public static void main(String[] args) {
        Neptun neptun = new Neptun();
        try {
            for (String line: neptun.readFile(neptun.filePath)) {
                neptun.neptunCodes.add(line.split(",")[1]);
            }
            System.out.println(neptun.neptunCodes);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
