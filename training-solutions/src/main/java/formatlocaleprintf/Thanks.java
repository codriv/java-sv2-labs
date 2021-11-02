package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Nagy Sándor", "Kis Anna", "Tóth Mari"));
        for ( String name: list) {
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!\n", name);
        }
    }
}
