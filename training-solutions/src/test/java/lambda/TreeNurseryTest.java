package lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeNurseryTest {

    List<Sapling> saplings = new ArrayList<>(Arrays.asList(
            new Sapling("alma", 100),
            new Sapling("körte", 120),
            new Sapling("meggy", 95),
            new Sapling("alma", 90),
            new Sapling("barack", 50),
            new Sapling("meggy", 110),
            new Sapling("meggy", 70)
    ));

    TreeNursery treeNursery = new TreeNursery(saplings);

    @Test
    void prune() {
    }

    @Test
    void sell() {
        assertEquals(7, treeNursery.getSaplings().size());
        assertEquals("meggy", treeNursery.getSaplings().get(2).getSpecies());
        treeNursery.sell("meggy", 90);
        assertEquals(5, treeNursery.getSaplings().size());
        assertEquals("alma", treeNursery.getSaplings().get(2).getSpecies());
    }
}