package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course1 = new Course("java", new SimpleTime(4, 25));
    Course course2 = new Course("backend", new SimpleTime("10:35"));

    @Test
    void getName() {
        assertEquals("java", course1.getName());
    }

    @Test
    void getBegin() {
        assertEquals(10, course2.getBegin().getHour());
        assertEquals(35, course2.getBegin().getMinute());
    }

    @Test
    void testToString() {
        assertEquals("4:25: java", course1.toString());
    }

    @Test
    void invalidFormat4Test() {
        InvalideTimeException ite = assertThrows(InvalideTimeException.class,
                () -> new Course("java", new SimpleTime("12:65")));
        assertEquals("Minute is invalid (0-59)", ite.getMessage());
    }

    @Test
    void invalidFormat5Test() {
        InvalideTimeException ite = assertThrows(InvalideTimeException.class,
                () -> new Course("java", new SimpleTime("12a:b")));
        assertEquals("Time is not hh:mm", ite.getMessage());
    }
}