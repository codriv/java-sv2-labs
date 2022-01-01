package interfacestaticmethods.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void ofTest() {
        Vehicle vehicleBicycle = Vehicle.of(2);
        assertEquals(Bicycle.class, vehicleBicycle.getClass());
        Vehicle vehicleCar = Vehicle.of(4);
        assertEquals(Car.class, vehicleCar.getClass());
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> Vehicle.of(5));
        assertEquals("Number of wheels is not correct!", exception.getMessage());
    }
}