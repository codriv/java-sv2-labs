package inheritancemethods.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeepTest {

    @Test
    void testJeep() {

        Jeep jeep = new Jeep(6, 30, 50, 20, 8);
        assertEquals(6,jeep.getFuelRate());
        assertEquals(30, jeep.getFuel());

        jeep.drive(100);
        assertEquals(2, jeep.getExtraFuel());
        assertEquals(30, jeep.getFuel());

        jeep.drive(200);
        assertEquals(0, jeep.getExtraFuel());
        assertEquals(20, jeep.getFuel());

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> jeep.drive(400));
        assertEquals("Not enough fuel!", exception.getMessage());

        jeep.modifyFuelAmount(3);
        assertEquals(23, jeep.getFuel());
        assertEquals(47, jeep.calculateRefillAmount());

        jeep.modifyFuelAmount(20);
        assertEquals(43, jeep.getFuel());
        assertEquals(0, jeep.getExtraFuel());
        assertEquals(27, jeep.calculateRefillAmount());

        jeep.modifyFuelAmount(10);
        assertEquals(3, jeep.getExtraFuel());
        assertEquals(50, jeep.getFuel());

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> jeep.modifyFuelAmount(100));
        assertEquals("Not enough capacity!", illegalArgumentException.getMessage());
        assertEquals(17, jeep.calculateRefillAmount());
    }
}