package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("sdfs45 rg4.6trewrt, 8, 376 sdfgsd!%");
        System.out.println(digits.getList());
    }

    List<Integer> list = new ArrayList<>();

    private List<Integer> getList() {
        return list;
    }

    public void addDigitsToList(String text) {
        char[] charArray = text.toCharArray();
        for (char character: charArray) {
            if (Character.isDigit(character)) {
                list.add(Integer.parseInt(Character.toString(character)));
            }
        }
    }
}
