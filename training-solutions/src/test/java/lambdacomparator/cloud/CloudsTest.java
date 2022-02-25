package lambdacomparator.cloud;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CloudsTest {

    Clouds clouds = new Clouds();
    List<CloudStorage> cloudStorages;

    @BeforeEach
    void  init() {
        cloudStorages = new ArrayList<>(List.of(
                new CloudStorage("egy", 2000, PayPeriod.MONTHLY, 1500), //0,75  //9000
                new CloudStorage("ketto", 1500, PayPeriod.ANNUAL, 6000),    //0,33  //4000
                new CloudStorage("Arom", 5000, PayPeriod.LIFETIME, 36500),  //0,121667  //1460
                new CloudStorage("begy", 1000, PayPeriod.ANNUAL, 3500), //0,29167   //3500
                new CloudStorage("öt", 10000, PayPeriod.LIFETIME, 150000),  //0,25  //3000
                new CloudStorage("hat", 4000, PayPeriod.MONTHLY, 1200)  //0,3   //3600
        ));
    }

    @Test
    void alphabeticallyFirst3() {
        assertEquals("Arom", clouds.alphabeticallyFirst(cloudStorages).getProvider());
    }

    @Test
    void bestPriceForShortestPeriod() {
        assertEquals("Arom", clouds.bestPriceForShortestPeriod3(cloudStorages).getProvider());
    }

    @Test
    void worstOffers() {
        List<CloudStorage> worsts = List.of(cloudStorages.get(0), cloudStorages.get(1), cloudStorages.get(5));
        assertEquals(worsts, clouds.worstOffers(cloudStorages));
    }

    @Test
    void worstOffersName() {
        List<String> worsts = List.of("egy", "ketto", "hat");
        assertEquals(worsts, clouds.worstOffers(cloudStorages).stream().map(CloudStorage::getProvider).toList());
    }
}