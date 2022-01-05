package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    List<String> testNames = List.of("Szabó Emese", "Szabó Ferenc");
    Siblings siblings = new Siblings();
    Path path = Path.of("src/test/resources/exceptionresource/names.txt");
    Path wrongPath = Path.of("wrongPath/names.txt");

    @Test
    void getFullNames() {
        assertTrue(testNames.equals(siblings.getFullNames("Szabó", path)));
    }

    @Test
    void getFullNamesWrongPath() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> siblings.getFullNames("Szabó", wrongPath));
        assertEquals("Can not read file", ise.getMessage());
        assertTrue(ise.getCause() instanceof IOException);
    }
}