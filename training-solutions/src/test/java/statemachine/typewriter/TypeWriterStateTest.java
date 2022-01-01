package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void switchCapsLockTest() {
        assertEquals(TypeWriterState.ON, TypeWriterState.OFF.switchCapsLock());
        assertEquals(TypeWriterState.OFF, TypeWriterState.ON.switchCapsLock());
    }
}