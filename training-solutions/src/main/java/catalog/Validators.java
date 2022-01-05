package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String string) {
        if (string == null || string.isBlank()) {
            throw new IllegalArgumentException("Empty title");
        }
        return false;
    }

    public static boolean isEmpty(List list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Empty authors");
        }
        return false;
    }

    public static boolean isNegative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative pageNumber");
        }
        return false;
    }
}
