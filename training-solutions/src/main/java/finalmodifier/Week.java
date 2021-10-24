package finalmodifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week {
    public static void main(String[] args) {
        List<String> daysOfWeek = Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");
        daysOfWeek.set(1, "szerda");
        System.out.println();
        System.out.println(daysOfWeek.toString());
    }

}
