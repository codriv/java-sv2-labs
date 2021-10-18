package conventions;

public class CarMain {
    public static void main(String[] args) {
        System.out.println("\r\nCar 1.0\r\n");
        Car car = new Car("VW", "2.0 TSI", 4, 5);
        car.addModelName("Passat");
        System.out.println("Az autó adatai:");
        printOut(car);
        car.setCarType("Ford");
        car.setEngineType("2.5 FHEV");
        car.setDoors(5);
        car.setPersonS(7);
        car.addModelName("S-MAX");
        System.out.println("\r\nAz új autó adatai:");
        printOut(car);
    }

     public static void printOut(Car car) {
         System.out.println(car.getCarType() + " " + car.getEngineType() + " " + car.getDoors() + " ajtós " + car.getPersons() + " személyes");
     }
}
