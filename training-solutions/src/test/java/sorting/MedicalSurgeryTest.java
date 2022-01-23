package sorting;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MedicalSurgeryTest {

    @Test
    void getPatientsInTimeOrder() {
        MedicalSurgery medicalSurgery = new MedicalSurgery(Arrays.asList(
                new Patient("Aladár", "456-789-654", LocalTime.of(15,30)),
                new Patient("Cecília", "654-589-135", LocalTime.of(17,35)),
                new Patient("Béla", "795-254-423", LocalTime.of(12,20)),
                new Patient("Sándor", "189-462-725", LocalTime.of(14,45))
        ));
        List<Patient> testList = medicalSurgery.getPatientsInTimeOrder();
        assertEquals("Béla", testList.get(0).getName());
        assertEquals("654-589-135", testList.get(testList.size() - 1).getTaj());
    }
}