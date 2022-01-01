package interfaceextends.robots;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AstroBoyTest {

    @Test
    void moveToTest() {
        Point nullPoint = new Point(0, 0, 0);
        AstroBoy astroBoy = new AstroBoy(nullPoint);
        Point newPoint = new Point(5, 6, 0);
        astroBoy.moveTo(newPoint);
        assertEquals(1, astroBoy.getPath().size());
        assertEquals(5, astroBoy.getPath().get(0).getX());
        assertEquals(6, astroBoy.getPath().get(0).getY());
        assertEquals(0, astroBoy.getPath().get(0).getZ());
    }

    @Test
    void fastMoveToTest() {
        Point nullPoint = new Point(0, 0, 0);
        AstroBoy astroBoy = new AstroBoy(nullPoint);
        Point newPoint = new Point(5, 6, 0);
        astroBoy.fastMoveTo(newPoint);
        assertEquals(5, astroBoy.getPosition().getX());
        assertEquals(6, astroBoy.getPosition().getY());
        assertEquals(0, astroBoy.getPosition().getZ());

        assertEquals(3, astroBoy.getPath().size());
        assertEquals(0, astroBoy.getPath().get(0).getX());
        assertEquals(0, astroBoy.getPath().get(0).getY());
        assertEquals(AstroBoy.ALTITUDE, astroBoy.getPath().get(0).getZ());

        assertEquals(5, astroBoy.getPath().get(1).getX());
        assertEquals(6, astroBoy.getPath().get(1).getY());
        assertEquals(AstroBoy.ALTITUDE, astroBoy.getPath().get(1).getZ());

        assertEquals(5, astroBoy.getPath().get(2).getX());
        assertEquals(6, astroBoy.getPath().get(2).getY());
        assertEquals(0, astroBoy.getPath().get(2).getZ());
    }

    @Test
    void rotateTest() {
        Point nullPoint = new Point(0, 0, 0);
        AstroBoy astroBoy = new AstroBoy(nullPoint);
        final int angle = 30;
        astroBoy.rotate(angle);
        assertEquals(30, astroBoy.getAngle());
    }

    @Test
    void liftToTest() {
        Point nullPoint = new Point(0, 0, 0);
        AstroBoy astroBoy = new AstroBoy(nullPoint);
        final long altitude = 25;
        astroBoy.liftTo(altitude);
        assertEquals(25, astroBoy.getAltitude());
    }
}