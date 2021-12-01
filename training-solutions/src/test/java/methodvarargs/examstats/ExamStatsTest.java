package methodvarargs.examstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    ExamStats examStats = new ExamStats(100);

    @Test
    void testGetNumberOfTopGrades() {
        int numberOfTopGrades = examStats.getNumberOfTopGrades(60, 50, 60, 70, 80);
        assertEquals(3, numberOfTopGrades);
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> examStats.getNumberOfTopGrades(60));
        assertEquals("Minimum 1 result required!", exception.getMessage());
    }

    @Test
    void testHasAnyFailed() {
        assertTrue(examStats.hasAnyFailed(60, 50, 60, 70, 80));
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> examStats.hasAnyFailed(60));
        assertEquals("Minimum 1 result required!", exception.getMessage());
    }

}