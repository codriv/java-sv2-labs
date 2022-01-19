package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    @Test
    void searchPeak() {
        Mountain mountain = new Mountain(new int[] {1250, 2500, 3254, 4500, 5400});
        Peak peak = new Peak("Kakasülő", 4500);
        Peak peak2 = new Peak("Kupac", 2);

        assertTrue(mountain.searchPeak(peak));
        assertFalse(mountain.searchPeak(peak2));
    }
}