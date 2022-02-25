package activitytracker;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TrackPoint {

    private long id;
    private LocalDateTime time;
    private double lat;
    private double lon;

    public TrackPoint(LocalDateTime time, double lat, double lon) {
        this.time = time;
        this.lat = lat;
        this.lon = lon;
    }

    public TrackPoint(int id, LocalDateTime time, double lat, double lon) {
        this(time, lat, lon);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }
}
