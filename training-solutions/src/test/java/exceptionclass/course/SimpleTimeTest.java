package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    SimpleTime simpleTime = new SimpleTime(10, 52);
    SimpleTime simpleTimeString = new SimpleTime("10:52");

    @Test
    void getHour() {
        assertEquals(10, simpleTime.getHour());
        assertEquals(10, simpleTimeString.getHour());
    }

    @Test
    void getMinute() {
        assertEquals(52, simpleTime.getMinute());
        assertEquals(52, simpleTimeString.getMinute());
    }

    @Test
    void testToString() {
        assertEquals("10:52", simpleTime.toString());
        assertEquals("10:52", simpleTimeString.toString());
    }

    @Test
    void invalidFormatTest() {
        InvalideTimeException ite = assertThrows(InvalideTimeException.class,
                () -> new SimpleTime("10:52:45"));
        assertEquals("Time is not hh:mm", ite.getMessage());
    }

    @Test
    void invalidFormat2Test() {
        InvalideTimeException ite = assertThrows(InvalideTimeException.class,
                () -> new SimpleTime("10:"));
        assertEquals("Time is not hh:mm", ite.getMessage());
    }

    @Test
    void invalidFormat3Test() {
        InvalideTimeException ite = assertThrows(InvalideTimeException.class,
                () -> new SimpleTime("25:12"));
        assertEquals("Hour is invalid (0-23)", ite.getMessage());
    }

    @Test
    void invalidFormat4Test() {
        InvalideTimeException ite = assertThrows(InvalideTimeException.class,
                () -> new SimpleTime("12:65"));
        assertEquals("Minute is invalid (0-59)", ite.getMessage());
    }

    @Test
    void invalidFormat5Test() {
        InvalideTimeException ite = assertThrows(InvalideTimeException.class,
                () -> new SimpleTime("12:3a"));
        assertEquals("Time is not hh:mm", ite.getMessage());
    }

    @Test
    void invalidFormat6Test() {
        InvalideTimeException ite = assertThrows(InvalideTimeException.class,
                () -> new SimpleTime("12a:20"));
        assertEquals("Time is not hh:mm", ite.getMessage());
    }

    @Test
    void invalidFormat7Test() {
        InvalideTimeException ite = assertThrows(InvalideTimeException.class,
                () -> new SimpleTime("12a:20"));
        assertEquals(NumberFormatException.class, ite.getCause().getClass());
        assertEquals("NumberFormatException", ite.getCause().getClass().getSimpleName());
    }
}