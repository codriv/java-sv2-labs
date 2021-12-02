package defaultconstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateTest {

    SimpleDate simpleDate = new SimpleDate();

    @Test
    void setDate() {
        simpleDate.setDate(1995, 12, 10);
        assertEquals(12,simpleDate.getMonth());
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(1850, 5, 2));
        assertEquals("Date is not correct!", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(1950, 4, 31));
        assertEquals("Date is not correct!", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(2015, 2, 29));
        assertEquals("Date is not correct!", exception.getMessage());
        simpleDate.setDate(2016, 2, 29);
        assertEquals(29, simpleDate.getDay());
    }
}