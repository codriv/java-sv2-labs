package exception.measurement;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    Path path = Path.of("src/test/resources/exception/measurementdata.csv");
    Path wrongPath = Path.of("wrongPath/measurementdata.csv");
    Measurement measurement = new Measurement();

    @Test
    void readFromFile() throws IOException {
        List<String> lines = measurement.readFromFile(path);
        assertEquals(11, lines.size());
        assertEquals("4,12.4,JohnDoe", lines.get(4));
    }

    @Test
    void readFromFileWrongPath() {
        IllegalStateException ioe = assertThrows(IllegalStateException.class,
                () -> measurement.readFromFile(wrongPath));
        assertEquals("Can not read file!", ioe.getMessage());
    }

    @Test
    void validate() {
        List<String> lines = measurement.readFromFile(path);
        List<String> wrongData = measurement.validate(lines);
        assertEquals(8, wrongData.size());
        assertEquals("3,12a.4,John Doe", wrongData.get(2));
    }

}