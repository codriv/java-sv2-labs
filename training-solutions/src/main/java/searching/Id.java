package searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Id {

    public static List<Integer> ids = new ArrayList<>();

    public static int getId() {
        Random random = new Random();
        int randomId = random.nextInt(1000);
        while (ids.contains(randomId)) {
            randomId = random.nextInt(1000);
        }
        ids.add(randomId);
        return randomId;
    }
}
