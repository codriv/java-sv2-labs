package sorting;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {

    private List<Car> cars;

    public CarDealer(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getCarsSortedByYear() {
        List<Car> cars = getCars();
        cars.sort(new CarConstructionComparator());
        return cars;
    }

    public List<Car> getCarsSortedByPrice() {
        List<Car> cars = getCars();
        cars.sort(new CarPriceComparator());
        return cars;
    }
}
