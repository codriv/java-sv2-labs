package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {

    List<String> bunchOfFlowers = new LinkedList<>();

    public BunchOfFlowers(List<String> bunchOfFlowers) {
        this.bunchOfFlowers = bunchOfFlowers;
    }

    public LinkedList<String> getBunchOfFlowers() {
        return new LinkedList<>(bunchOfFlowers);
    }

    public void addFlowerInTheMiddle(String flower) {
        int index = bunchOfFlowers.size() / 2;
        if (bunchOfFlowers.size() % 2 == 0) {
            bunchOfFlowers.add(index, flower);
        } else {
            bunchOfFlowers.add(index, flower);
            bunchOfFlowers.add(index + 2, flower);
        }
    }
}
