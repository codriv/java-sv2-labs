package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void tableClothTest() {
        TableCloth tableCloth = new TableCloth(2.5);
        assertEquals(2.5, tableCloth.getSide());
        assertEquals(3.53, tableCloth.getLengthOfDiagonal(), 0.01);
        assertEquals(10, tableCloth.getPerimeter());
        assertEquals(6.25, tableCloth.getArea());
    }

}