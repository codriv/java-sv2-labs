package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();
        String[] arrayOfFoods = {"spenót", "pörkölt", "spagetti", "tökfőzelék", "palacsinta"};
//        System.out.println(foods.toString());
        for (String item: arrayOfFoods) {
            foods.add(item);
        }
        for (String item: foods) {
            System.out.println(item);
        }
        System.out.println(foods.size());

        foods.removeAll(Arrays.asList("pörkölt", "tökfőzelék"));
        for (String item: foods) {
            System.out.println(item);
        }
        System.out.println(foods.size());
    }


}
