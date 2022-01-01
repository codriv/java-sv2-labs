package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car = new Car(1900, 4);

    @Test
    void getNumberOfPassengerTest() {
        assertEquals(4, car.getNumberOfPassenger());
    }

    @Test
    void getGrossLoadTest() {
        assertEquals(2275, car.getGrossLoad());
    }

    @Test
    void testToStringTest() {
        assertEquals("Car{numberOfPassenger=4, vehicleWeight=2275}", car.toString());
    }
}