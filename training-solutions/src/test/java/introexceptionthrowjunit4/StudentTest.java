package introexceptionthrowjunit4;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StudentTest {

    Student student = new Student();

    @Test
    public void addNoteTest() {
        student.addNote(4);
        assertEquals(1, student.getNotes().size());
        assertEquals(4, (int)student.getNotes().get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNoteTestWithException() {
        student.addNote(0);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void addNoteTestWithRule() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Note must be between 1 and 5!");
        student.addNote(6);
    }

    @Test
    public void addNotetestWithAssertThrows() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(7));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}
