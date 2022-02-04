package activity;

public class Coordinate {

    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        validate(latitude, longitude);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private void validate(double latitude, double longitude) {
        if (-90 > latitude || latitude > 90 || -180 > longitude || longitude > 180) {
            throw new IllegalArgumentException("Wrong coordinates!");
        }
    }
}
