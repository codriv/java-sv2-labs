package collectionsautoboxing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {

    Paper paper = new Paper();

    @BeforeEach
    void fill() {
        paper.putFurtherPaper("1.a", 235);
        paper.putFurtherPaper("5.b", 421);
        paper.putFurtherPaper("8.a", 398);
        paper.putFurtherPaper("7.c", 152);
        paper.putFurtherPaper("6.b", 497);
        paper.putFurtherPaper("4.b", 278);
    }

    @Test
    void putFurtherPaper() {
        assertEquals(6, paper.getSumPerClasses().size());
    }

    @Test
    void getWinnerClass() {
        assertEquals("6.b", paper.getWinnerClass());
    }

    @Test
    void getTotalWeight() {
        assertEquals(1981, paper.getTotalWeight());
    }
}