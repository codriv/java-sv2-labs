package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    Woman woman = new Woman("Kis Mari", LocalDate.of(1999, 10, 20));
    Man man = new Man("Nagy Sándor", LocalDate.of(1995, 4, 30));
    LocalDate today = LocalDate.now();
    String description = "Házasságkötés ideje";

    @Test
    void testGetMarried() {
        Marriage marriage = new Marriage();
        assertEquals("Kis Mari", woman.getName());
        marriage.getMarried(woman, man);
        assertEquals(today, woman.getRegisterDates().get(1).getDate());
        assertEquals(description, man.getRegisterDates().get(1).getDescription());
        assertEquals("Nagyné Kis Mari", woman.getName());
    }
}