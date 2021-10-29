package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("fésű", "körömreszelő", "hajsütő");
        System.out.println("\nA lista:");
        for (String item: importantThings) {
            System.out.println(" " + item);
        }
        importantThings.set(1, "légkalapács");
        System.out.println("\nA módosított lista:");
        for (String item: importantThings) {
            System.out.println(" " + item);
        }}
}
