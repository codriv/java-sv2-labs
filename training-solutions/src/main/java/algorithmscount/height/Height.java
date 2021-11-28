package algorithmscount.height;

import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> heightOfChildren, int heightLimit) {
        int countChildrenWithHeightGreaterThan = 0;
        for (Integer heightOfChild: heightOfChildren) {
            if (heightOfChild > heightLimit) {
                countChildrenWithHeightGreaterThan++;
            }
        }
        return countChildrenWithHeightGreaterThan;
    }
}
