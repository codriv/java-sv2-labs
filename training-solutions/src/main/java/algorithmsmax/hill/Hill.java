package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> heights) {
        int max = heights.get(0);
        for (int i = 1; i < heights.size(); i++) {
            if (heights.get(i) > max) {
            max = heights.get(i);
            }
        }
        return max;
    }
}
