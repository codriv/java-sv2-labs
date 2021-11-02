package primitivetypes.exam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam {
    private List<Person> list = new ArrayList<>(Arrays.asList(
            new Person("Nagy Sándor", LocalDate.of(1985, 5, 10), 8500, 3.5),
            new Person("Fekete Péter", LocalDate.of(1986, 6, 9), 8425, 3.8),
            new Person("Vörös Piroska", LocalDate.of(1987, 7, 8), 2541, 4.2)
        )
    );

    public List<Person> getList() {
        return list;
    }

    public void addPerson(Person person) {
        list.add(person);
    }

    @Override
    public String toString() {
        String list = "";
        for (Person person: this.list) {
            list += person;
        }
        return " " + list.trim();
    }
}
