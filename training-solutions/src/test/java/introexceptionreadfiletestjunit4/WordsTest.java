package introexceptionreadfiletestjunit4;

import org.junit.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class WordsTest {
    Words words = new Words();
    Path path = Paths.get("src/test/resources/introexceptionreadfiletestjunit4/words.txt");
    Path pathWithoutA = Paths.get("src/test/resources/introexceptionreadfiletestjunit4/wordsWithoutA.txt");
    Path wrongPath = Paths.get("wrongPath/words.txt");

    @Test
    public void getFirstWordWithATest() {
        String word = words.getFirstWordWithA(path);
        assertEquals("Anna", word);
    }

    @Test
    public void getFirstWordWithATestWithException() {
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(wrongPath));
        assertEquals("Can not read file", exception.getMessage());
    }

    @Test
    public void getFirstWordWithATestWithoutMatch() {
        String word = words.getFirstWordWithA(pathWithoutA);
        assertEquals("A", word);
    }
}