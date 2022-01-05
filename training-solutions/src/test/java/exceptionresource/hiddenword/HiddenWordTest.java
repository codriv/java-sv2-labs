package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    Path path = Path.of("src/test/resources/hiddenword/hiddenword.txt");
    Path wrongPath = Path.of("wrongPath/hiddenword.txt");
    HiddenWord hiddenWord = new HiddenWord();

    @Test
    void getHiddenWord() {
        assertEquals("ALMA KÖRTE", hiddenWord.getHiddenWord(path));
    }

    @Test
    void getHiddenWordWrongPath() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> hiddenWord.getHiddenWord(wrongPath));
        assertEquals("Can not read file", ise.getMessage());
        assertTrue(ise.getCause() instanceof IOException);
    }
}