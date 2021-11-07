package enumtypes.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        for (SolarSystem planet: SolarSystem.values()) {
            System.out.println(planet.name() + ": " + planet.getNumberOfSatellites());
        }
    }
}
