package arraylist;

import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 9, 42, 67, 4, 0, 76, 14, 84, 35, 92);
        System.out.println("\nA teljes lista:\n" + list.toString().replaceAll("[\\[\\]]", ""));
        System.out.println("\nMinden második:");
        for (int i = 1; i < list.size(); i += 2) {
            System.out.print(list.get(i) + (i < list.size() - 2 ? ", " : "\n"));
        }
    }
}
