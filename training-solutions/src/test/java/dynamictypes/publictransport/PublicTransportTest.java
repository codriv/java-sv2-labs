package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testCreateAndAddVehicles() {

        PublicTransport publicTransport = new PublicTransport();
        PublicVehicle vehicleBus = new Bus(2, 18.5, "Volvo");
        PublicVehicle vehicleTram = new Tram(5, 25, 4);
        PublicVehicle vehicleMetro = new Metro(3, 32.5, 8);

        publicTransport.addVehicle(vehicleBus);
        publicTransport.addVehicle(vehicleTram);
        publicTransport.addVehicle(vehicleMetro);

        assertEquals(3, publicTransport.getVehicles().size());
    }


}