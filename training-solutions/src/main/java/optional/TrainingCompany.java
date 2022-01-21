package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TrainingCompany {

    private List<Course> courses;

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> selected = Optional.empty();
        for (Course course: courses) {
            if (maxPrice >= course.getPrice()) {
                selected = Optional.of(course);
            }
        }
        return selected.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        Optional<Integer> selected = Optional.empty();
        for (Course course: courses) {
            if (name.equals(course.getName()) && level == course.getLevel()) {
                selected = Optional.of(course.getPrice());
            }
        }
        return selected.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public String getNameOfCourseWithGivenLevel(Level level) {
        Optional<String> selected = Optional.empty();
        for (Course course: courses) {
            if (level == course.getLevel()) {
                selected = Optional.of(course.getName());
            }
        }
        return selected.orElse("Sorry, there is no course at this level.");
    }

    public static void main(String[] args) {
        TrainingCompany tc= new TrainingCompany(Arrays.asList(
                new Course("egy", Level.BEGINNER, 2500)
        ));
        System.out.println(tc.getCheaperCourse(50));
    }
}