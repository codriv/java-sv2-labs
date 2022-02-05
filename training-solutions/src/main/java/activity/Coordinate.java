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
        if (latitude < -90 || 90 < latitude || longitude < -180 || 180 < longitude) {
            throw new IllegalArgumentException("Wrong coordinates!");
        }
    }
}