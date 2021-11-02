package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("írjon be egy összetett mondatot!");
        String text = scanner.nextLine();
        scanner = new Scanner(text);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        System.out.println();

        Scanner newScanner = new Scanner(System.in);
        System.out.println("írjon be még egy összetett mondatot!");
        newScanner = new Scanner(newScanner.nextLine()).useDelimiter(", ");
        while (newScanner.hasNext()) {
            System.out.println(newScanner.next());
        }
    }
}
