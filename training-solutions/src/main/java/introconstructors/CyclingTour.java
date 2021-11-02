package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson(int person) {
        this.numberOfPeople += person;
    }

    public void ride(double km) {
        this.kms += km;
    }

    public void printOut(CyclingTour cyclingTour) {
        System.out.println("Túra leírása: " + cyclingTour.getDescription());
        System.out.println("túra napja: " + cyclingTour.getStartTime());
        System.out.println("résztvevők száma: " + cyclingTour.getNumberOfPeople() + " fő");
        System.out.println("megtett távolság: " + cyclingTour.getKms() + " km");
    }
}
