package searching;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LostAndFoundOfficeTest {

    @Test
    void findLostProperty() {
        LostAndFoundOffice lafo = new LostAndFoundOffice();
        lafo.addObject(new LostProperty("AN456", "bicikli", LocalDate.of(2022, 1, 16)));
        lafo.addObject(new LostProperty("AN464", "telefon", LocalDate.of(2022, 1, 19)));
        lafo.addObject(new LostProperty("AN234", "konyv", LocalDate.of(2022, 1, 17)));
        lafo.addObject(new LostProperty("AN765", "buksza", LocalDate.of(2022, 2, 10)));
        lafo.addObject(new LostProperty("AN754", "kulcs", LocalDate.of(2022, 3, 16)));
        lafo.addObject(new LostProperty("AN987", "konyv", LocalDate.of(2022, 1, 15)));

        assertEquals("AN987", lafo.findLostProperty("konyv").getRegNumber());
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> lafo.findLostProperty("szamologep"));
        assertEquals("Object not found!", iae.getMessage());
    }
}