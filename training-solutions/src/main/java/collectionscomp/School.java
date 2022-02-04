package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());
        students.add(new Student("Pisti", 150));
        students.add(new Student("Aladár", 156));
        students.add(new Student("Árnika", 152));
        students.add(new Student("Marcsi", 145));
        students.add(new Student("Klára", 130));
        students.add(new Student("Evetke", 147));
        students.add(new Student("Sára", 160));
        students.add(new Student("Éliás", 143));
        students.add(new Student("Móricka", 155));
        System.out.println(students);

        Map<String, Integer> studentsMap = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        students.forEach(student -> studentsMap.put(student.getName(), student.getHeight()));
        System.out.println(studentsMap);

        List<String> bs = Arrays.asList("Ő", "ál", "Ú", "Ü", "Ó", "ű", "O", "ev", "av", "él");
        Set<String> betuk = new TreeSet<>(Collator.getInstance(new Locale("hu", "HU")));
        bs.forEach(t -> betuk.add(t));
        System.out.println(betuk);

        List<String> cs = new ArrayList<>(betuk);
        Collections.sort(cs, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        Collator collator = Collator.getInstance(new Locale("hu", "HU"));
                        return collator.compare(o1, o2);
                    }
                });
        System.out.println(cs);
    }
}
