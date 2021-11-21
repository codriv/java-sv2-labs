package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class WordsTest {
    Words words = new Words();
    Path path = Paths.get("src/test/resources/introexceptionreadfiletestjunit5/words.txt");
    Path pathWithoutA = Paths.get("src/test/resources/introexceptionreadfiletestjunit5/wordsWithoutA.txt");
    Path wrongPath = Paths.get("wrongPath/words.txt");

    @Test
    void getFirstWordWithATest() {
        String word = words.getFirstWordWithA(path);
        assertEquals("Anna", word);
    }

    @Test
    void getFirstWordWithATestWithException() {
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(wrongPath));
        assertEquals("Can not read file", exception.getMessage());
    }

    @Test
    void getFirstWordWithATestWithoutMatch() {
        String word = words.getFirstWordWithA(pathWithoutA);
        assertEquals("A", word);
    }
}