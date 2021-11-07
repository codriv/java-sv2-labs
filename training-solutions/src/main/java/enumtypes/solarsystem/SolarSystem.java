package enumtypes.solarsystem;

public enum SolarSystem {
    MERCURY(0), VENUS(0), EARTH(1), MARS(2),
    JUPITER(63), SATURN(62), URANUS(27), NEPTUNE(13),
    PLUTO(6);

    private final int numberOfSatellites;

    SolarSystem(int numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }
}
