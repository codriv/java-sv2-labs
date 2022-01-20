package lambda;

import java.util.Collections;
import java.util.List;

public class TreeNursery {

    private List<Sapling> saplings;

    public TreeNursery(List<Sapling> saplings) {
        this.saplings = saplings;
    }

    public List<Sapling> getSaplings() {
        return saplings;
    }

    public void prune(int maxHeight) {
        saplings.forEach((Sapling sapling) -> sapling.setHeight(maxHeight));
    }

    public void sell(String species, int minHeight) {
        saplings.removeIf((sapling) -> species.equals(sapling.getSpecies()) && minHeight < sapling.getHeight());
    }
}
