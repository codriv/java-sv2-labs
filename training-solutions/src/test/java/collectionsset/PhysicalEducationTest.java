package collectionsset;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class PhysicalEducationTest {

    List<Student> students = List.of(new Student("Nagy Sándor", 175),
            new Student("Kis Péter", 170),
            new Student("Piros Alma", 160),
            new Student("Zöld Piroska", 165));

    TreeSet<Integer> expexted = new TreeSet(List.of(160, 165, 170, 175));

    @Test
    void getOrderInLessons() {
        PhysicalEducation pe = new PhysicalEducation();
        assertEquals(expexted, pe.getOrderInLessons(students));
    }
}