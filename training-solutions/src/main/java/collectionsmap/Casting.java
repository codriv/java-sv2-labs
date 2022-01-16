package collectionsmap;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int number = Integer.MAX_VALUE;
        for (int applicant: applicants.keySet()) {
            if (applicant > lastNumber && applicant < number) {
                number = applicant;
            }
        }
        return applicants.get(number);
    }

}
