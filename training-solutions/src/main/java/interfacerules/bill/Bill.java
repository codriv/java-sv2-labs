package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Bill {

    List<String> readBillItemsFromFile(Path path) {
        List<String> billItemsFromFile = null;
        try {
            billItemsFromFile = Files.readAllLines(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return billItemsFromFile;
    }
}
