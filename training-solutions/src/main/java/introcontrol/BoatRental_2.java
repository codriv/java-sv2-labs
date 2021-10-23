package introcontrol;

import java.util.Scanner;

public class BoatRental_2 {
    public static void main(String[] args) {
        System.out.println("\nBoatRental 2.0\n");
        int boat1 = 2;
        int boat2 = 3;
        int boat3 = 5;
        boolean boat1In = true;
        boolean boat2In = true;
        boolean boat3In = true;
        int seats = 10;
        System.out.print("A csoport létszáma: ");

        Scanner scanner = new Scanner(System.in);
        int group = scanner.nextInt();

        if (group > 3) {
            seats -= boat3;
            group -= boat3;
            System.out.print("Egy " + boat3 + " személyes");
            boat3In = false;
        }
        if (group > 2 ) {
            seats -= boat2;
            group -= boat2;
            System.out.print((boat3In ? "Egy " : ((group > 0 ? ", egy " : " és egy "))) + boat2 + " személyes");
            boat2In = false;
        }
        if (group > 0) {
            seats -= boat1;
            group -= boat1;
            System.out.print(((boat3In && boat2In) ? "Egy " : " és egy ") + boat1 + " személyes");
            boat1In = false;
        }
        System.out.println(((boat1In && boat2In && boat3In) ? "0" : "") + " hajót vittek ki.");
        System.out.println("Még " + ((boat1In ? boat1 : 0) + (boat2In ? boat2 : 0) + (boat3In ? boat3 : 0)) + " személy mehet ki.");
        System.out.print((boat1In || boat2In || boat3In) ? "\nBent lévő hajók:" + (boat1In ? "\n - egy " + boat1 + " személyes hajó" : "") +
                (boat2In ? "\n - egy " + boat2 + " személyes hajó" : "") + (boat3In ? "\n - egy " + boat3 + " személyes hajó" : "") + "\n" : "");
        System.out.print(group > 0 ? "\nA parton maradt " + group + " ember!\n" : "");
    }
}
