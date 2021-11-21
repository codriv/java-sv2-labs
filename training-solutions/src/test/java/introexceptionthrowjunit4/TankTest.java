package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TankTest {
    Tank tank = new Tank();

    @Before
    public void init() {
        tank.modifyAngle(50);
    }

    @Test
    public void tankTest() {
        assertEquals(50, tank.getAngle());
    }

    @Test(expected = IllegalArgumentException.class)
    public void tankTestWithException() {
        tank.modifyAngle(40);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void tankTestWithRule() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("A megadott szöggel már nem tud elfordulni a cső!");
        tank.modifyAngle(40);
    }

    @Test
    public void tankTestWithAssertThrows() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(-140));
        assertEquals("A megadott szöggel már nem tud elfordulni a cső!", exception.getMessage());
    }

}
