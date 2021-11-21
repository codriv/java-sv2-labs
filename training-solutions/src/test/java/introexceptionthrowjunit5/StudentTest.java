package introexceptionthrowjunit5;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {
    Student student = new Student();

    @Test
    public void addNoteTest() {
        student.addNote(4);
        assertEquals(4, student.getNotes().get(0));
    }

    @Test
    public void addNoteTestWithAssertThrows() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
            () -> student.addNote(6));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}

