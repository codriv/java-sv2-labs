package methodoverloading;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA classFiveA = new ClassFiveA(new ArrayList<>(Arrays.asList(
            "Nagy Sándor", "KisMari", "Fekete Péter", "Zöld Piroska", "Piros Alma")));

        @Test
        void testGetTodayReferringStudentWithInt() {
            String StudentExpected = "Fekete Péter";
            String StudentActual = classFiveA.getTodayReferringStudent(2);
            assertEquals(StudentExpected, StudentActual);
    }

        @Test
        void testGetTodayReferringStudentWithNumber() {
            String StudentExpected = "Fekete Péter";
            String StudentActual = classFiveA.getTodayReferringStudent(Number.THREE);
            assertEquals(StudentExpected, StudentActual);
    }

        @Test
        void testGetTodayReferringStudentWithNumberName() {
            String StudentExpected = "Fekete Péter";
            String StudentActual = classFiveA.getTodayReferringStudent("THREE");
            assertEquals(StudentExpected, StudentActual);
    }
}