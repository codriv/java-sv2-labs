package introexceptionthrowjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TankTest {
    Tank tank = new Tank();

    @BeforeEach
    void init() {
        tank.modifyAngle(50);
    }

    @Test
    void tankTest() {
        assertEquals(50, tank.getAngle());
    }

    @Test
    void tankTestWithException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(40));
        assertEquals("A megadott szöggel már nem tud elfordulni a cső!", exception.getMessage());
    }
}
