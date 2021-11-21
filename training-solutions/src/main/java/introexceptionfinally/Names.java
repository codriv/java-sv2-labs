package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    private Path pathDr = Paths.get("src/main/resources/introexceptionfinally/namesDr.txt");
    private Path path = Paths.get("src/main/resources/introexceptionfinally/names.txt");
    private Path wrongPath = Paths.get("wrongPath/names.txt");

    public static void main(String[] args) {
        try {
            String firstDr = new Names().getFirstDr();
            System.out.println(firstDr);
        }
        catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            System.out.println(ise.getCause().getMessage());
        }
    }

    public List<String> getNames() {
        try {
//            return Files.readAllLines(pathDr);
//            return Files.readAllLines(path);
            return Files.readAllLines(wrongPath);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        finally {
            System.out.println("End of reading.");
        }
    }

    public String getFirstDr() {
        List<String> names = getNames();
        for (String name: names) {
            if (name.split(" ")[0].equalsIgnoreCase("dr.")) {
                return name;
            }
        }
        return "";
    }
}