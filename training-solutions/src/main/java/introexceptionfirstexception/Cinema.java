package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adja meg a nevét: ");
        String name = scanner.nextLine();
        System.out.print("Adja meg a film címét: ");
        String title = scanner.nextLine();
        System.out.print("Hány jegyet szeretne? ");
        int numberOfTickets = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Melyik sorba? ");
        int row = scanner.nextInt();
        scanner.nextLine();
        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:");
        System.out.printf(" Vásárló neve: %s", name);
        System.out.printf("\n Film címe: %s", title);
        StringBuilder seats = new StringBuilder("\n Lefoglalt helyek:\n  ");
        for (int i = 1; i <= numberOfTickets; i++) {
            seats.append(row + ". sor " + i + ". szék");
            seats.append(i < numberOfTickets ? ", " : "");
        }
        System.out.println(seats);
        System.out.printf("Jó szórakozást!");
    }

}
