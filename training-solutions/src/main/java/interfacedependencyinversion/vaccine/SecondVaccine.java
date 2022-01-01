package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine extends Filter implements Vaccine{

    private List<Person> vaccinationList = new ArrayList<>();

    public List<Person> getVaccinationList() {
        return new ArrayList<>(vaccinationList);
    }

    public List<Person> generateVaccinationList (List<Person> registrated) {
        List<Person> listWithoutPregAndChron = new ArrayList<>(registrated);
        listWithoutPregAndChron.removeAll(getPregnants(registrated));
        listWithoutPregAndChron.removeAll(getChronics(registrated));
        List<Person> youngPersons = new ArrayList<>(listWithoutPregAndChron);
        youngPersons.removeAll(getOldPersons(registrated));
        vaccinationList.addAll(youngPersons);
        vaccinationList.addAll(getOldPersons(listWithoutPregAndChron));
        return vaccinationList;
    }
}