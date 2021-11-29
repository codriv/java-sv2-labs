package immutable;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private int yearOfProduction;

    public Car(String brand, String model, int year) {
        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Brand name cannot be empty!");
        } else {
            this.brand = brand;
        }
        this.model = model;
        if (year > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year of production cannot be in the future!");
        } else {
            this.yearOfProduction = year;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}