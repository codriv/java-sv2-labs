package looptypes;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student();
        student1.setName("Kis Gábor");
        list.add(student1);
        Student student2 = new Student();
        student2.setName("Nagy Sándor");
        list.add(student2);
        Student student3 = new Student();
        student3.setName("Zöld Géza");
        list.add(student3);
        Student student4 = new Student();
        student4.setName("Jó Gyula");
        list.add(student4);
        Student student5 = new Student();
        student5.setName("Fekete Péter");
        list.add(student5);

        System.out.println("\nA kezdeti lista:");
        for (Student item: list) {
            System.out.println(" " + item.getName());
        }

        System.out.println();
        student2.setActive(false);
        student4.setActive(false);
        System.out.println(student2.getName() + " (aktív státusz: " + student2.isActive() + ")");
        System.out.println(student4.getName() + " (aktív státusz: " + student4.isActive() + ")");
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).isActive()) {
                list.remove(list.get(i));
            }
        }

        System.out.println("\nFrissített lista:");
        for (Student item: list) {
            System.out.println(" " + item.getName());
        }
    }
}
