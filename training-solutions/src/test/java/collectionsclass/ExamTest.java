package collectionsclass;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    int places = 4;
    int placesMuch = 8;
    Exam exam = new Exam(Arrays.asList(
            new ExamResult("Sári", 154),
            new ExamResult("Pisti", 125),
            new ExamResult("Kati", 184),
            new ExamResult("Maki", 174),
            new ExamResult("Puki", 145),
            new ExamResult("Manci", 169)
            ));

    @Test
    void getNamesOfSucceededPeople() {
        assertEquals(4, exam.getNamesOfSucceededPeople(4).size());
        assertEquals("Kati", exam.getNamesOfSucceededPeople(4).get(0));
        assertEquals("Sári", exam.getNamesOfSucceededPeople(4).get(3));
    }

    @Test
    void getNamesOfSucceededPeopleWithPlacesMuch() {
        assertEquals(6, exam.getNamesOfSucceededPeople(8).size());
        assertEquals("Kati", exam.getNamesOfSucceededPeople(8).get(0));
        assertEquals("Pisti", exam.getNamesOfSucceededPeople(8).get(5));
    }
}