package interfacedefaultmethods;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperations{

    Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    public String getLongWord() {
        List<String> matrix = readFromFile(path);
        StringBuilder wordSB = new StringBuilder(matrix.get(0));
        for (int i = 1; i < matrix.size(); i++) {
            wordSB.append(matrix.get(i).charAt(matrix.get(i).length() - 1));
        }
        return wordSB.toString();
    }
}
