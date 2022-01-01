package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void getNumberOfSeatsInFamilyCar() {
        FamilyCar familyCar = new FamilyCar();
        assertEquals(5, familyCar.getNumberOfSeats());
    }
    @Test
    void getNumberOfSeatsInSportsCar() {
        SportsCar sportsCar = new SportsCar();
        assertEquals(2, sportsCar.getNumberOfSeats());
    }

    @Test
    void getNumberOfSeatsInCar() {
        Car car = new Car("Opel", 7);
        assertEquals(7, car.getNumberOfSeats());
    }
}