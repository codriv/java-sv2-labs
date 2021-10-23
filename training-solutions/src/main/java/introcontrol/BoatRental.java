package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        System.out.println("\nBoatRental 1.0\n");
        int boat1 = 2;
        int boat2 = 3;
        int boat3 = 5;
        int sumBoat = boat1 + boat2 + boat3;
        int groupAfter = 0;
        String boatText = " személyes hajót vittek el.";
        String afterText = " fő mehet utánuk.";
        System.out.print("A csoport létszáma: ");

        Scanner scanner = new Scanner(System.in);
        int group = scanner.nextInt();

        if (group <= boat1) {
            System.out.println("Egy " + boat1 + boatText);
            groupAfter = sumBoat - boat1;
            System.out.println("Még " + groupAfter + afterText);
        } else  if (group <= boat2) {
            System.out.println("Egy " + boat2 + boatText);
            groupAfter = sumBoat - boat2;
            System.out.println("Még " + groupAfter + afterText);
        } else  if (group <= boat3) {
            System.out.println("Egy " + boat3 + boatText);
            groupAfter = sumBoat - boat3;
            System.out.println("Még " + groupAfter + afterText);
        } else  if (group <= boat3 + boat1) {
            System.out.println("Egy " + boat3 + " és egy " + boat1 + boatText);
            groupAfter = sumBoat - (boat1 + boat3);
            System.out.println("Még " + groupAfter + afterText);
        } else  if (group <= boat3 + boat2) {
            System.out.println("Egy " + boat3 + " és egy " + boat2 + boatText);
            groupAfter = sumBoat - (boat2 + boat3);
            System.out.println("Még " + groupAfter + afterText);
        } else  if (group <= boat3 + boat2 + boat1) {
            System.out.println("Egy " + boat3 + ", egy " + boat2 + " és egy " + boat1 + boatText);
            groupAfter = sumBoat - (boat1 + boat2 + boat3);     // 0
            System.out.println("Nincs több hajó. " + groupAfter + afterText);
        } else {
            System.out.println("Az összes hajót elvitték és még " + (group - sumBoat) + " ember maradt a parton.");
        }
    }
}
