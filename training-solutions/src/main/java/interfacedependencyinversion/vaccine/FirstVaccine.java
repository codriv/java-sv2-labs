package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine extends Filter implements Vaccine{

    private List<Person> vaccinationList = new ArrayList<>();

    public List<Person> getVaccinationList() {
        return new ArrayList<>(vaccinationList);
    }

    public List<Person> generateVaccinationList (List<Person> registrated) {
        vaccinationList.addAll(getPregnants(registrated));
        vaccinationList.addAll(getOldPersons(registrated));
        vaccinationList.addAll(getOthers(registrated));
        return vaccinationList;
    }
}