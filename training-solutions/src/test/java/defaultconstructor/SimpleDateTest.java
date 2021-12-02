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
    }
}