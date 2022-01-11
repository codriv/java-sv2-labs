package collectionsset;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> heights = new TreeSet<>();
        for (Student student: students) {
            heights.add(student.getHeight());
        }
        return heights;
    }

    public static void main(String[] args) {
        List<Student> students = List.of(new Student("Nagy Sándor", 175),
                new Student("Kis Péter", 170),
                new Student("Piros Alma", 160),
                new Student("Zöld Piroska", 165));

        System.out.println(new PhysicalEducation().getOrderInLessons(students));
    }
}
