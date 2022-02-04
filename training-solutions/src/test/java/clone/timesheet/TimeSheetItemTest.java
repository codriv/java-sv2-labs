package clone.timesheet;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeSheetItemTest {

    @Test
    void copyWithDifferentEmployee() {
        TimeSheetItem t1 = new TimeSheetItem("egy", "p1",
                LocalDateTime.of(2022, 1, 15, 8, 30),
                LocalDateTime.of(2022, 1, 15, 10, 45));

        TimeSheetItem t2 = new TimeSheetItem(t1);

        assertEquals(t1.getEmployee(), t2.getEmployee());
        assertEquals(t1.getProject(), t2.getProject());
        assertEquals(t1.getFrom(), t2.getFrom());
        assertEquals(t1.getTo(), t2.getTo());

        TimeSheetItem t3 = t1.copyWithDifferentEmployee(t1, "három");

        assertEquals("három", t3.getEmployee());
        assertEquals(t1.getProject(), t3.getProject());
        assertEquals(t1.getFrom(), t3.getFrom());
        assertEquals(t1.getTo(), t3.getTo());
    }
}