package activitytracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Activity {
    
    private int id;
    private LocalDateTime startTime;
    private String desc;
    private ActivityType type;
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public Activity(LocalDateTime startTime, String desc, ActivityType type) {
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public Activity(int id, LocalDateTime startTime, String desc, ActivityType type) {
        this(startTime, desc, type);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public ActivityType getType() {
        return type;
    }

    public List<TrackPoint> getTrackPoints() {
        return Collections.unmodifiableList(trackPoints);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", desc='" + desc + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return id == activity.id && startTime.equals(activity.startTime) && desc.equals(activity.desc) && type == activity.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, desc, type);
    }
}
