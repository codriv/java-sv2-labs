package inheritancemethods.cars;

public class Car {
    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        double fuelMissing = tankCapacity - fuel;
        if (fuel > fuelMissing) {
        throw new IllegalArgumentException("Not enough capacity!");
    }
        this.fuel += fuel;
    }

    public void drive(int km) {
        double fuelRequired = km * fuelRate / 100;
        if (fuelRequired > fuel) {
            throw new IllegalArgumentException("Not enough fuel!");
        } else {
            fuel -= fuelRequired;
        }
    }

    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }
}
