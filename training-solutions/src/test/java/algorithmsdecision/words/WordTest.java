package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    Word word = new Word();
    List<String> words = Arrays.asList("szó", "szavak", "mondatok", "szarvasmarha");
    String wordLimitTrueExpected = "testTrue";
    String wordLimitFalseExpected = "ellenállhatatlan";

    @Test
    void testContainsLongerWord() {
        assertTrue(word.containsLongerWord(words, wordLimitTrueExpected));
        assertFalse(word.containsLongerWord(words, wordLimitFalseExpected));
    }
}