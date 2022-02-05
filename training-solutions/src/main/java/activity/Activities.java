package activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Activities {

    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report>distancesByTypes() {
        List<Report> distanceByTypes = new ArrayList<>();
        Arrays.stream(ActivityType.values()).forEach(type -> distanceByTypes.add(new Report(type, getSumOfDistances(type))));
        return Collections.unmodifiableList(distanceByTypes);
    }

    private double getSumOfDistances(ActivityType activityType) {
        return activities.stream().filter(act -> activityType == act.getType())
                .mapToDouble(Activity::getDistance).sum();
    }

    public long numberOfTrackActivities() {
        return activities.stream().filter(this::isActivityWithTrack).count();
    }

    public long numberOfWithoutTrackActivities() {
        return activities.stream().filter(act -> !isActivityWithTrack(act)).count();
    }

    public boolean isActivityWithTrack(Activity activity) {
        return activity.getClass() == ActivityWithTrack.class;
    }
}
