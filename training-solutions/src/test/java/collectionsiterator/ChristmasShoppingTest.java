package collectionsiterator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasShoppingTest {

    List<ChristmasPresent> presents = Arrays.asList(
            new ChristmasPresent("könyv", "Péter", 2500),
            new ChristmasPresent("satupad", "Béla", 52500),
            new ChristmasPresent("vasaló", "Piroska", 12500),
            new ChristmasPresent("bicikli", "Juliska", 82500)
    );
    ChristmasShopping cs = new ChristmasShopping(presents);

    @Test
    void addNewPresentTest() {
        assertEquals(4, cs.getPresents().size());
        cs.addNewPresent(new ChristmasPresent("pulóver", "Gábor", 5000));
        assertEquals(5, cs.getPresents().size());
        assertEquals("pulóver", cs.getPresents().get(4).getDescription());
    }

    @Test
    void removeTooExpensivePresentTest() {
        assertEquals(4, cs.getPresents().size());
        cs.removeTooExpensivePresent(50_000);
        assertEquals(2, cs.getPresents().size());
    }
}