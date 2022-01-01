package interfacedefaultmethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public interface FileOperations {

    default List<String> readFromFile(Path path) {
        List<String> readFromFile = null;
        try {
           readFromFile = Files.readAllLines(path);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return readFromFile;
    }

    String getLongWord();
}
