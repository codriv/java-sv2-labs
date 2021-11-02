package enumtypes.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        for (Continent continent: Continent.values()) {
            System.out.println(continent);
        }
        System.out.println(Arrays.deepToString(Continent.values()));

        for (Ocean ocean: Ocean.values()) {
            System.out.println(Ocean.valueOf(ocean.name()));
        }

       for (Football post: Football.values()) {
           System.out.println(post.name());
       }
    }
}
