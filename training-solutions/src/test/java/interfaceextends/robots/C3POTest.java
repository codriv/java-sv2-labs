package interfaceextends.robots;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C3POTest {

    @Test
    void testMoveTo() {
        Point nullPoint = new Point(0, 0, 0);
        C3PO c3PO = new C3PO(nullPoint);
        Point newPoint = new Point(5, 6, 0);
        c3PO.moveTo(newPoint);
        assertEquals(5, c3PO.getPath().get(0).getX());
        assertEquals(6, c3PO.getPath().get(0).getY());
        assertEquals(0, c3PO.getPath().get(0).getZ());
    }

    @Test
    void testFastMoveTo() {
        Point nullPoint = new Point(0, 0, 0);
        C3PO c3PO = new C3PO(nullPoint);
        Point newPoint = new Point(5, 6, 0);
        c3PO.fastMoveTo(newPoint);
        assertEquals(5, c3PO.getPath().get(0).getX());
        assertEquals(6, c3PO.getPath().get(0).getY());
        assertEquals(0, c3PO.getPath().get(0).getZ());
    }

    @Test
    void testRotate() {
        Point nullPoint = new Point(0, 0, 0);
        C3PO c3PO = new C3PO(nullPoint);
        final int angle = 30;
        c3PO.rotate(angle);
        assertEquals(30, c3PO.getAngle());
    }
}