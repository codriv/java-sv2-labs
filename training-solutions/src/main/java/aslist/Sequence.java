package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 3));
        System.out.print("\nA kezdeti lista: " + elements.toString() + "\n");
        int sizeOfList = 6;
        for ( int i = 2; i < sizeOfList; i++) {
            elements.add(elements.get(i - 2) * elements.get(i - 1));
        }
        System.out.println("\nAz új lista " + sizeOfList + " elemet tartalmaz.");
        System.out.println(elements.toString());
    }
}
