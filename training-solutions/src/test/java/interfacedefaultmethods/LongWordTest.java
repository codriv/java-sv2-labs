package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    Path path = Path.of("src/test/resources/longword.txt");

    @Test
    void getLongWordTest() {
        LongWord longWord = new LongWord(path);
        assertEquals("LONGWORD", longWord.getLongWord());
    }
}