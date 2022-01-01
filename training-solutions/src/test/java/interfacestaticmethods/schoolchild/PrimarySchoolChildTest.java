package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {

    @Test
    void ofTest() {
        PrimarySchoolChild schoolChildYoung = PrimarySchoolChild.of(7);
        assertEquals("LowerClassSchoolChild", schoolChildYoung.getClass().getSimpleName());
        PrimarySchoolChild schoolChildOld = PrimarySchoolChild.of(12);
        assertEquals("UpperClassSchoolChild", schoolChildOld.getClass().getSimpleName());
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> PrimarySchoolChild.of(24));
        assertEquals("Age is not correct!", exception.getMessage());
    }
}