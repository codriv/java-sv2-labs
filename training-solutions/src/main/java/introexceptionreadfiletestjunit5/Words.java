package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {
    public String getFirstWordWithA(Path path) {
        List<String> words = getWords(path);
        int i = 0;
        while (i < words.size() && !"A".equals(words.get(i).substring(0,1))) {
            i++;
        }
        return i == words.size() ? "A" : words.get(i);
    }

    private List<String> getWords(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}