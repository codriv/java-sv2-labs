package collectionslist;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {

    @Test
    void addFlowerInTheMiddle() {
        BunchOfFlowers bunchOfFlowers = new BunchOfFlowers(new LinkedList(List.of("Tulip", "Carnation")));
        System.out.println(bunchOfFlowers.getBunchOfFlowers());

        bunchOfFlowers.addFlowerInTheMiddle("Lily");
        System.out.println(bunchOfFlowers.getBunchOfFlowers());
        assertEquals(3, bunchOfFlowers.getBunchOfFlowers().size());
        assertEquals("Lily", bunchOfFlowers.getBunchOfFlowers().get(1));

        bunchOfFlowers.addFlowerInTheMiddle("Violet");
        System.out.println(bunchOfFlowers.getBunchOfFlowers());
        assertEquals(5, bunchOfFlowers.getBunchOfFlowers().size());
        assertEquals("Violet", bunchOfFlowers.getBunchOfFlowers().get(1));
        assertEquals("Violet", bunchOfFlowers.getBunchOfFlowers().get(3));
    }
}