package formatlocaleprintf;

import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Run {

    public static void main(String[] args) {
        Run run = new Run("Nagy Sándor");
        run.addRun(12.2);
        System.out.println(run.printFormattedRunText());
        run.addRun(15);
        run.addRun(8.7);
        run.addRun(10);
        System.out.println(run.printFormattedRunText());
    }

    private List<Double> kms;
    private String name;

    public Run(String name) {
        this.name = name;
        kms = new ArrayList<>();
    }

    public void addRun(double km) {
        kms.add(km);
    }

    public String printFormattedRunText() {
//        Kiss Béla!2021-09-13.412,8
        String format = String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %2.1f km-t futottál. Csak így tovább!", name, LocalDate.now().toString(), kms.size(), kms.get(kms.size() - 1));
        return format;
//        return "";
    }
}
