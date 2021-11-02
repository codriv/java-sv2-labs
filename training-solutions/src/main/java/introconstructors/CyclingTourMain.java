package introconstructors;

import java.time.LocalDate;

public class CyclingTourMain {
    public static void main(String[] args) {
        System.out.println("\nBiciklitúra adatai:\n");
        CyclingTour cyclingTour = new CyclingTour("TourDeBalaton", LocalDate.of(2021,11,12));
        cyclingTour.printOut(cyclingTour);
        int personsToAdd = 5;
        int kmsToAdd = 125;
        cyclingTour.registerPerson(personsToAdd);
        cyclingTour.ride(kmsToAdd);
        System.out.println("\nJelentkezett: " + personsToAdd + " fő");
        System.out.println("megtettek: " + kmsToAdd + " km-t");System.out.println("");
        System.out.println("Az új adatok:\n");
        cyclingTour.printOut(cyclingTour);
    }
}
