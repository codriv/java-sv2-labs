package activitytracker;

import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        Activity activity1 = new Activity(1, LocalDateTime.of(2022, 1, 10, 10, 10), "Bicikli", ActivityType.BIKING);
        Activity activity2 = new Activity(2, LocalDateTime.of(2022, 1, 20, 20, 20), "Fut", ActivityType.RUNNING);
        Activity activity3 = new Activity(3, LocalDateTime.of(2022, 2, 10, 5, 5), "Tura", ActivityType.HIKING);

        ActivityRepository ar = new ActivityRepository();

        ar.connect("localhost", 3306, "activitytracker");
//        ar.sqlQuery();
        ar.creteTable();
        ar.insert(activity1);
        ar.insert(activity2);
        ar.insert(activity3);
    }
}
