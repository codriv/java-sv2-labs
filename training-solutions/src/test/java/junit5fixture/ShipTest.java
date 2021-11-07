package junit5fixture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void newShip() {
        ship = new Ship("Bismarck", 1940, 250.5);
    }

    @Test
    void testName() {
        assertEquals("Bismarck", ship.getName());
        assertNotEquals("Queen Mary", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1940, ship.getYearOfConstruction());
        assertTrue(ship.yearOfConstruction == 1940);
        assertFalse(ship.yearOfConstruction == 1952);
    }
    @Test
    void testLength() {
        assertEquals(250.6, ship.getLength(), 0.1);
    }
    @Test
    void testNull() {
        Ship ship2 = new Ship("Bismarck", 1940, 250.5);
        ship2 = null;
        assertNull(ship2);
        assertNotNull(ship);
    }
    @Test
    void testSameObjects() {
        Ship ship3 = new Ship("Bismarck", 1940, 250.5);
        ship3 = ship;
        assertSame(ship3, ship);
    }
    @Test
    void testNotSameObjects() {
        Ship ship4 = new Ship("Bismarck", 1940, 250.5);
        assertNotSame(ship4, ship);
    }
}

