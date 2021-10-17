package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\r\nÜgyfél nyilvántartás 1.0\r\n");
        System.out.println("Adja meg a nevét!");
        client.name = scanner.nextLine();
        System.out.println("Adja meg a születési évét!");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adja meg a címét!");
        client.address = scanner.nextLine();
        System.out.println("\r\nÜgyféladatok:\r\n");
        System.out.println(" név: " + client.name);
        System.out.println(" születési év: " + client.year);
        System.out.println(" cím: " + client.address);
    }
}
