package constructoroverloading.advertisement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdvertisementTest {

    @Test
    void create() {
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement("bicikli", 100_000);
        BikeAdvertisement bikeAdvertisement2 = new BikeAdvertisement("bicikli", 100_000, "Csepel");
        BikeAdvertisement bikeAdvertisement3 = new BikeAdvertisement("bicikli", 100_000, "Csepel",
                Arrays.asList("váltó", "kosár"));
        BikeAdvertisement bikeAdvertisement4 = new BikeAdvertisement("bicikli", 100_000, "Csepel",
                Arrays.asList("váltó", "kosár"), "AN567345LU");
        assertEquals(100_000, bikeAdvertisement.getPrice());
        assertEquals("Csepel", bikeAdvertisement2.getBrand());
        assertEquals("váltó", bikeAdvertisement3.getExtras().get(0));
        assertEquals("AN567345LU", bikeAdvertisement4.getSerialNumber());
    }
}