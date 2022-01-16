package collectionsqueue;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class VaccinationTest {

    List<Person> persons = List.of(new Person("Nagy Sándor", 54),
                                    new Person("Kis Péter", 17),
                                    new Person("Zöld Piroska", 25),
                                    new Person("Piros Alma", 40),
                                    new Person("Fekete Péter", 66),
                                    new Person("Tank Aranka", 32));

    @Test
    void getVaccinationOrder() {
        PriorityQueue<Integer> expected = new PriorityQueue<>(List.of(32, 25, 40, 54));
        Vaccination vaccination = new Vaccination();
        assertEquals(expected, vaccination.getVaccinationOrder(persons));
        System.out.println(vaccination.getVaccinationOrder(persons));
    }
}