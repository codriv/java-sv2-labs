package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntScanner {

    public static void main(String[] args) {
        String ints = "";
//        String ints = "5;3;107;12;123;18;198";
        IntScanner intScanner = new IntScanner();
        System.out.println(intScanner.convertInts(ints));
    }


    public StringBuilder convertInts(String ints) {
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder numbers = new StringBuilder();
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number > 100) {
                numbers.append(number);
                numbers.append(",");
            }
        }
        if (numbers.length() != 0) {
            if (Character.compare(',', numbers.charAt(numbers.length() - 1)) == 0) {
                numbers.delete((numbers.length() - 1), numbers.length());
            }
        }
        return numbers;
    }
}
