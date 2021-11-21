package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {

    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/introexceptioncause/palutcaifiuk.txt"));
    }

    public void printOut() throws IOException {
        for (String boy: readFile()) {
            System.out.println("Nemecsek Ernő".equals(boy) ? boy.toLowerCase() : boy);
        }
    }

    public static void main(String[] args) {
        try {
            new PaulStreetBoys().printOut();
        }
        catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
