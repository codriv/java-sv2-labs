package math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Nagy Sándor", "Kis János", "Fekete Péter", "Jó Gyula", "Fehér Anna",
                "Piros Ildikó", "Tatár Zsigmond", "Németh László", "Horváth Béla", "Szabó István");
        System.out.println("\nA teljes névsor:");
        System.out.println(list.toString());
        Random rnd = new Random();
        int numberOne = rnd.nextInt(5) + 1;
        int numberTwo = rnd.nextInt(5) + 6;

        System.out.println();
        System.out.println("A kisorsolt nevek:");
        System.out.println(list.get(numberOne - 1));
        System.out.println(list.get(numberTwo - 1));
    }

}
