package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();
        System.out.println("\nA lista:");
        String[] arrayOfFoods = {"spenót", "pörkölt", "spagetti", "tökfőzelék", "palacsinta"};
        for (String item: arrayOfFoods) {
            foods.add(item);
        }
        for (String item: foods) {
            System.out.println(" " + item);
        }
        System.out.println("\nA lista mérete:");
        System.out.println(" " + foods.size());

        System.out.println("\nA listáról levettűk a pörköltet és a tökfőzeléket. A frissített lista:");
        foods.removeAll(Arrays.asList("pörkölt", "tökfőzelék"));
        for (String item: foods) {
            System.out.println(" " + item);
        }

        System.out.println("\nA frissített lista mérete:");
        System.out.println(" " + foods.size());
    }


}
