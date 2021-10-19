package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        System.out.println("\r\nTávolság 1.0\r\n");
        Distance distance = new Distance(5.2, true);
        System.out.println("Távolság: " + distance.getDistanceInKm());
        System.out.println("pontos: " + distance.isExact());
        int kmInt = (int)distance.getDistanceInKm();
        System.out.println("Távolság egész része: " + kmInt);
    }
}