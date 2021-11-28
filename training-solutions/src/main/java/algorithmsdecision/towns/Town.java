package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> habitants, int fewerThan) {
        for (int habitant: habitants) {
            if (habitant < fewerThan) {
                return true;
            }
        }
        return false;
    }
}
