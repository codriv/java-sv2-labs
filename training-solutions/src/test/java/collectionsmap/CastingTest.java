package collectionsmap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CastingTest {

    Casting casting = new Casting();
//    77, 105, 19, 45 és 82

    @Test
    void callNextApplicant() {
        Map<Integer, String> applicants = new HashMap<>();
        applicants.put(77, "Kiss József");
        applicants.put(105, "Nagy Sándor");
        applicants.put(19, "Piros Alma");
        applicants.put(45, "Zöld Piroska");
        applicants.put(82, "Feket Péter");

        assertEquals("Zöld Piroska", casting.callNextApplicant(40, applicants));
    }
}