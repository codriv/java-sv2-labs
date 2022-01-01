package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public List<Person> getPregnants (List<Person> registrated) {
        List<Person> pregnants = new ArrayList<>();
        for (Person person: registrated) {
            if (person.getPregnant() == Pregnancy.YES) {
                pregnants.add(person);
            }
        }
        return pregnants;
    }

    public List<Person> getChronics (List<Person> registrated) {
        List<Person> chronics = new ArrayList<>();
        for (Person person: registrated) {
            if (person.getChronic() == ChronicDisease.YES) {
                chronics.add(person);
            }
        }
        return chronics;
    }

    public List<Person> getOldPersons (List<Person> registrated) {
        List<Person> oldPersons = new ArrayList<>();
        for (Person person: registrated) {
            if (person.getAge() > 65 && person.getPregnant() == Pregnancy.NO) {
                oldPersons.add(person);
            }
        }
        return oldPersons;
    }

    public List<Person> getOthers (List<Person> registrated) {
        List<Person> others = new ArrayList<>(registrated);
        others.removeAll(getPregnants(registrated));
        others.removeAll(getOldPersons(registrated));
        return others;
    }
}