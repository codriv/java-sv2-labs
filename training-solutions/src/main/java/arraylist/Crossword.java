package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        String[] arrayOfWords = {"KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA"};
        List<String> listOfWords = Arrays.asList(arrayOfWords);
        List<String> sixLetters = new ArrayList<>();
        for (String item: listOfWords) {
            if (item.length() == 6) {
                sixLetters.add(item);
            }
        }
        System.out.println("\nA teljes lista:");
        System.out.println(Arrays.toString(arrayOfWords).replaceAll("[\\[\\]]", ""));
        System.out.println("\nA hatbetűsek:");
        System.out.println(sixLetters.toString().substring(1, sixLetters.toString().length() - 1));
    }
}
