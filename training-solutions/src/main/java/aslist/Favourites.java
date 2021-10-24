package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAdja meg a következő adatokat!");
        String[] datas = {"színe", "étele", "itala", "állata"};
        for (String item: datas) {
            System.out.print("Kedvenc " + item + ": ");
            favouriteThings.add(scanner.nextLine());
        }
        System.out.println("\nA lista " + favouriteThings.size() + " elemből áll");
        for (String item: favouriteThings) {
            System.out.println(" " + item);
        };
    }
}
