package algorithmssum.school;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {
    List<Integer> TestHeadcounts = Arrays.asList(20,25,30,28,18);
    int numberOfStudentsExpected = 121;

    @Test
    void TestNumberOfStudents() {
        int numberOfStudentsActual = new School().getNumberOfStudents(TestHeadcounts);
        assertEquals(numberOfStudentsExpected, numberOfStudentsActual);
    }
}
