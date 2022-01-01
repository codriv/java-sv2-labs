package interfaceextends.polygon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    @Test
    void getNumberOfVerticesTest() {
        Polygon polygon = new Polygon(8.5, 9);
        assertEquals(9, polygon.getNumberOfVertices());
    }

    @Test
    void getLengthOfSideTest() {
        Polygon polygon = new Polygon(8.7, 8);
        assertEquals(8.7, polygon.getLengthOfSide());
    }

    @Test
    void getPerimeterTest() {
        Polygon polygon = new Polygon(5.2, 5);
        assertEquals(26, polygon.getPerimeter());
    }

    @Test
    void getNumberOfDiagonalsFromOneVertexTest() {
        Polygon polygon = new Polygon(7.3, 7);
        assertEquals(4, polygon.getNumberOfDiagonalsFromOneVertex());
    }

    @Test
    void getNumberOfAllDiagonalsTest() {
        Polygon polygon = new Polygon(6.4, 6);
        assertEquals(9, polygon.getNumberOfAllDiagonals());
    }
}