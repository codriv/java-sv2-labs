package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Süsü", 1, 2.5);
        assertEquals("Süsü", dragon.getName());
        assertNotEquals("Süsüke", dragon.getName());
    }
    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü", 1, 2.5);
        assertEquals(1, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 1);
        assertFalse(dragon.getNumberOfHeads() != 1);
    }
    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Süsü", 1, 2.584);
        assertEquals(2.59, dragon.getHeight(), 0.01);
    }
    @Test
    void testNull() {
        Dragon dragon1 = new Dragon("Süsü", 1, 2.584);
        Dragon dragon2 = null;
        assertNull(dragon2);
        assertNotNull(dragon1);
    }
    @Test
    void testSameObjects() {
        Dragon dragon1 = new Dragon("Süsü", 1, 2.584);
        Dragon dragon2 = dragon1;
        assertSame(dragon1, dragon2);
    }
    @Test
    void testNotSameObjects() {
        Dragon dragon1 = new Dragon("Süsü", 1, 2.584);
        Dragon dragon2 = new Dragon("Süsü", 1, 2.584);
        assertNotSame(dragon1, dragon2);
    }
}
