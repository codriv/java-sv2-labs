package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    @Test
    void testHopOnce() {
        Grasshopper grasshopper = new Grasshopper();
        grasshopper.hopOnce(Direction.POSITIVE);
        assertEquals(1, grasshopper.getPosition());
        grasshopper.hopOnce(Direction.NEGATIVE);
        assertEquals(0, grasshopper.getPosition());
    }

    @Test
    void testMoveFromZeroToThreeWithFiveHops() {
        Grasshopper grasshopper = new Grasshopper();
        grasshopper.moveFromZeroToThreeWithFiveHops();
        assertEquals(3, grasshopper.getPosition());
    }
}