package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {
    Prefix prefix = new Prefix();
    List<String> words = Arrays.asList("prefixum", "bicikli", "prejudikáció", "autó", "prehistoric", "motor", "precolumbian");
    String testPrefix = "pre";
    String wordWithPrefix = "prehistoric";
    String wordWithoutPrefix = "autó";

    @Test
    void testPrefix() {
        assertEquals(4, prefix.getWordsStartWith(words, testPrefix).size());
        assertTrue(prefix.getWordsStartWith(words, testPrefix).contains(wordWithPrefix));
        assertFalse(prefix.getWordsStartWith(words, testPrefix).contains(wordWithoutPrefix));
    }
}