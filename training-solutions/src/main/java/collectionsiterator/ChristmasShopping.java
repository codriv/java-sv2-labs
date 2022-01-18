package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

    private List<ChristmasPresent> presents;

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = new ArrayList<>(presents);
    }

    public List<ChristmasPresent> getPresents() {
        return presents;
    }

    public void addNewPresent(ChristmasPresent present) {
        presents.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        for(Iterator<ChristmasPresent> iterator = presents.iterator(); iterator.hasNext();) {
            ChristmasPresent actual = iterator.next();
            if (actual.getPrice() > maxPrice) {
                iterator.remove();
            }
        }
    }
}
