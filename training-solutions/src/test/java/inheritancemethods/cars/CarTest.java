package inheritancemethods.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCar() {

        Car car = new Car(5, 20, 40);
        assertEquals(20, car.getFuel());
        assertEquals(20, car.calculateRefillAmount());

        car.drive(200);
        assertEquals(10, car.getFuel());
        assertEquals(30, car.calculateRefillAmount());
    }
}