package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VanTest {

    Van van = new Van(2000, 3, 1500);

    @Test
    void getGrossLoadTest() {
        assertEquals(3800, van.getGrossLoad());
    }

    @Test
    void testToStringTest() {
        assertEquals("Van{cargoWeight=1500, numberOfPassenger=3, vehicleWeight=3800}", van.toString());
    }
}