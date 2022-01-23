package sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CarDealerTest {

    CarDealer carDealer = new CarDealer(Arrays.asList(
            new Car("Opel", 2014, 4000000),
            new Car("Volvo", 2015, 3000000),
            new Car("Audi", 2019, 7000000),
            new Car("VW", 2018, 5000000)
            ));

    @Test
    void getCarsSortedByYear() {
        assertEquals("Volvo", carDealer.getCarsSortedByPrice().get(0).getBrand());
        assertEquals(4000000, carDealer.getCarsSortedByYear().get(0).getPrice());
    }

    @Test
    void getCarsSortedByPrice() {
    }
}