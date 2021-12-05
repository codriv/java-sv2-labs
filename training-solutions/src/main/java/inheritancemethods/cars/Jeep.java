package inheritancemethods.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    public void modifyFuelAmount(double fuel) {
        double fuelMissing = getTankCapacity() - getFuel();
        if (fuel > (fuelMissing + extraCapacity)) {
            throw new IllegalArgumentException("Not enough capacity!");
        } else if (fuel > fuelMissing) {
            extraFuel += (fuel - fuelMissing);
            super.modifyFuelAmount(fuelMissing);
        } else {
            super.modifyFuelAmount(fuel);
        }
    }

    public void drive(int km) {
        double fuelRequired = km * getFuelRate() / 100;
        if (fuelRequired > extraFuel + getFuel()) {
            throw new IllegalArgumentException("Not enough fuel!");
        } else if (fuelRequired > extraFuel) {
            modifyFuelAmount(-(fuelRequired - extraFuel));
            extraFuel = 0;
        } else {
            extraFuel -= fuelRequired;
        }
    }

    public double calculateRefillAmount() {
        return getTankCapacity() + extraCapacity - getFuel() - getExtraFuel();
    }
}