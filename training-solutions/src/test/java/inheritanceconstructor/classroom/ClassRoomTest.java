package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    @Test
    void isSuitable() {
        ClassRoom classRoom = new ClassRoom("hely", 15, Facility.PROJECTOR);
        Course course = new Course(10, Facility.PROJECTOR);
        assertTrue(classRoom.isSuitable(course));
        assertEquals("hely", classRoom.getLocation());
    }

    @Test
    void isSuitableParticipants() {
        ClassRoom classRoom = new ClassRoom("hely", 15, Facility.PROJECTOR);
        Course course = new Course(20, Facility.PROJECTOR);
        assertFalse(classRoom.isSuitable(course));
    }

    @Test
    void isSuitableFacility() {
        ClassRoom classRoom = new ClassRoom("hely", 15, Facility.PROJECTOR);
        Course course = new Course(10, Facility.COMPUTERS);
        assertFalse(classRoom.isSuitable(course));
    }
}