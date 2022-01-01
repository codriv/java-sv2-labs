package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    Vehicle vehicle= new Vehicle(1800);

    @Test
    void getGrossLoadTest() {
        assertEquals(1875, vehicle.getGrossLoad());
    }

    @Test
    void testToStringTest() {
        assertEquals("Vehicle{vehicleWeight=1800}", vehicle.toString());
    }
}