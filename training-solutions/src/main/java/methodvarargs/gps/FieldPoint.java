package methodvarargs.gps;

import java.time.LocalDateTime;

public class FieldPoint {
    private LocalDateTime timeOfSetting;
    private LocalDateTime timeOfLogging;
    private double latitude;
    private double longitude;

    public FieldPoint(LocalDateTime timeOfSetting, double latitude, double longitude) {
        this.timeOfSetting = timeOfSetting;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocalDateTime getTimeOfLogging() {
        return timeOfLogging;
    }

    public LocalDateTime getTimeOfSetting() {
        return timeOfSetting;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setTimeOfLogging(LocalDateTime timeOfLogging) {
        this.timeOfLogging = timeOfLogging;
    }
}
