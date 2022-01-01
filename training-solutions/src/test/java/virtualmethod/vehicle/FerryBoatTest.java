package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FerryBoatTest {

    FerryBoat ferryBoat = new FerryBoat(40000);
    Car car = new Car(1800, 4);
    Car carOverWeight = new Car(4800, 3);
    Van van = new Van(2500, 2, 1000);

    @Test
    void getGrossLoadTest() {
        ferryBoat.load(car);
        assertEquals(42250, ferryBoat.getGrossLoad());
    }

    @Test
    void canCarryTest() {
        assertTrue(ferryBoat.canCarry(car));
        assertFalse(ferryBoat.canCarry(carOverWeight));
    }

    @Test
    void loadTest() {
        assertTrue(ferryBoat.load(car));
        assertFalse(ferryBoat.load(carOverWeight));
    }

    @Test
    void testCarToStringTest() {
        ferryBoat.load(car);
        assertEquals("FerryBoat{car=Car{numberOfPassenger=4, vehicleWeight=2175}}", ferryBoat.toString());
    }

    @Test
    void testVanToStringTest() {
        ferryBoat.load(van);
        assertEquals("FerryBoat{car=Van{cargoWeight=1000, numberOfPassenger=2, vehicleWeight=3725}}", ferryBoat.toString());
    }
}