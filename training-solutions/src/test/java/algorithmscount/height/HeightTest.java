package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightTest {
    List<Integer> heightOfChildren = Arrays.asList(152,135,164,148,180,175,168);
    int heightLimit = 165;
    int countChildrenWithHeightGreaterThanExpected = 3;

    @Test
    void testHeight() {
        int countChildrenWithHeightGreaterThanActual = new Height().countChildrenWithHeightGreaterThan(heightOfChildren, heightLimit);
        assertEquals(countChildrenWithHeightGreaterThanExpected, countChildrenWithHeightGreaterThanActual);
    }
}
