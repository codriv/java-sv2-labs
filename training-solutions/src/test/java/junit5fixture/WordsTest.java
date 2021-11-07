package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class WordsTest {
    Words words;

    @BeforeEach
    void newWords() {
        words = new Words();
        String[] testWords = {"szó", "szósz", "hatbetű", "hétbetű", "szavak"};
        for (String word: testWords) {
            words.addWord(word);
        }
    }

    @Test
    void testGetWordsStartWith() {
        List<String> expectedList = Arrays.asList("szó", "szósz");
        words.getWordsStartWith("szó");
        assertEquals(expectedList, words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        words.getWordsWithLength(7);
        assertEquals(Arrays.asList("hatbetű", "hétbetű"), words.getWords());
    }
}
