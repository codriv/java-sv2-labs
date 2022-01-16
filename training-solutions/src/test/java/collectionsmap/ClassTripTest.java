package collectionsmap;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    Path path = Path.of("src/test/resources/collectionsmap/inpayments.txt");
    ClassTrip classTrip = new ClassTrip();
    Set<String> names = new HashSet<>(Arrays.asList("Nagy Béla", "Kiss József", "Szép Virág"));
    Collection<Integer> payments = new HashSet<>(Arrays.asList(12500, 5000, 15000));

    @Test
    void loadInpayments() {
        classTrip.loadInpayments(path);
        assertEquals(12500, classTrip.getPayments().get("Kiss József"));
        assertEquals(12500, classTrip.getPayments().get("Kiss József"));
        System.out.println(classTrip.getPayments().values());
        System.out.println(classTrip.getPayments().keySet());
        assertEquals(names, classTrip.getPayments().keySet());
        assertEquals(payments, classTrip.getPayments().values());
    }
}