package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("fűnyírás", "lenyírni a füvet");
        System.out.println("\nA feladat: " + task.getTitle());
        System.out.println("leírás: " + task.getDescription());
        task.start();
        System.out.println("kezdés időpontja: " + task.getStartDateTime());
        task.setDuration(90);
        System.out.println("időtartam: " + task.getDuration() + " perc");
    }
}
