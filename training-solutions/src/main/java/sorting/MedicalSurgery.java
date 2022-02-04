package sorting;

import java.util.ArrayList;
import java.util.List;

public class MedicalSurgery {

    private List<Patient> patients;

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatients() {
        return new ArrayList<>(patients);
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> sortedList = getPatients();
        sortedList.sort(new PatientComparator());
        return sortedList;
    }
}
