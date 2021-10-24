package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(Arrays.asList("Kis Gábor", "Nagy Sándor",
                "Fehér András", "Fekete Péter", "Debreceni Ferdinánd", "Jó Béla", "Zöld Géza"));
        System.out.println("\nAz egész osztály:\n" + students.toString() + "\n");
        printStudyGroups(students);
    }
    public static void printStudyGroups(List<String> students){
        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();
        int numberOfLetters = 10;
        for (String item: students) {
            if (item.length() <= numberOfLetters) {
                group1.add(item);
            } else {
                group2.add(item);
            }
        }
        System.out.println("Az 1-es csoport (" + numberOfLetters + " betűs vagy rövidebb nevű tanulók):");
        System.out.println(group1.toString());
        System.out.println();
        System.out.println("Az 2-es csoport (" + numberOfLetters + " betűnél hosszabb nevű tanulók):");
        System.out.println(group2.toString());
    }
}
