package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {

    private List<String> names = new ArrayList<>(
            Arrays.asList("Kis Géza", "Nagy Sándor", "Fekete Péter", "Fehér Piroska", null, "Piros Alma")
    );

    public String getWinner() {
        Random random = new Random();
        int indexOfWinner = random.nextInt(names.size() - 1);
        return names.get(indexOfWinner).toUpperCase();
    }
}
