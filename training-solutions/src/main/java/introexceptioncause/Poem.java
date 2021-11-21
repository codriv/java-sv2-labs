package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        try {
            new Poem().readLines();
        }
        catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            System.out.println(ise.getCause().getClass());
        }
    }

    public void readLines () {
        try {
            List<String> poem = Files.readAllLines(Paths.get("src/main/resources/introexceptioncause/Poem.txt"));
            for (String line: poem) {
                System.out.print(line.substring(0,1));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}
