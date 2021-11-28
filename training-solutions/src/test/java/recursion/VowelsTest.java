package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {
    @Test
    void testGetNumbeerOfVowels() {
        Vowels vowels = new Vowels();
        assertEquals(4, vowels.getNumberOfVowels("magánhangzó"));
    }
}