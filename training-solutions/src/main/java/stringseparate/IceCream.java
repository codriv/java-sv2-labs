package stringseparate;

import java.util.Arrays;
import java.util.List;

public class IceCream {

    public static void main(String[] args) {
        IceCream iceCream = new IceCream();
        System.out.println(iceCream.getIcecreams());
    }

    private List<String> icecreams = Arrays.asList("csoki", "vanília", "eper", "citrom", "puncs");

    public StringBuilder getIcecreams() {
        StringBuilder list = new StringBuilder("Ma kapható: ");
        for (int i = 0; i < icecreams.size(); i++) {
            list.append(icecreams.get(i));
            list.append(i < icecreams.size() - 1 ? ", " : ".");
        }
        list.append(" Gyerekeknek féláron!");
        return list;
    }
}
