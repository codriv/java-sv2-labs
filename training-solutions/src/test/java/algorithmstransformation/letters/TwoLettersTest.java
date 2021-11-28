package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {
    TwoLetters twoLetters = new TwoLetters();
    List<String> words = Arrays.asList("szavakk", "kutya", "villa", "brokkoli", "türkizkék");
    int sizeOfListExpected = 5;
    String stringExpected = "ku";

    @Test
    void testGetFirstTwoLetters() {
        assertEquals(sizeOfListExpected, twoLetters.getFirstTwoLetters(words).size());
        assertEquals(stringExpected, twoLetters.getFirstTwoLetters(words).get(1));
    }
}