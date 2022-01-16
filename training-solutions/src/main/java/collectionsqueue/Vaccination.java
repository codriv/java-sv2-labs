package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {


    public Queue<Integer> getVaccinationOrder(List<Person> persons) {
        PriorityQueue ages = new PriorityQueue();
        for (Person person: persons) {
            int age = person.getAge();
            if (age >= 18 && age < 65) {
                ages.offer(age);
            }
        }
        return ages;
    }

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Nagy Sándor", 54));
        persons.add(new Person("Kis Péter", 17));
        persons.add(new Person("Zöld Piroska", 25));
        persons.add(new Person("Piros Alma", 40));
        persons.add(new Person("Fekete Péter", 66));
        persons.add(new Person("Tank Aranka", 32));

        Vaccination vaccination = new Vaccination();
        PriorityQueue ages = (PriorityQueue) vaccination.getVaccinationOrder(persons);
        System.out.println(ages);
        System.out.println(ages.poll());
        System.out.println(ages);
    }
}
