package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {
    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/introexceptioncheckedtrace/underground.txt"));
    }

    public String getDailySchedule(List<String> underground) {
        StringBuilder dailySchedule = new StringBuilder(LocalDate.now().toString());
        dailySchedule.append(",");
        for (String line: underground) {
            if (line.startsWith("2")) {
                dailySchedule.append(" ");
                dailySchedule.append(line);
            }
        }
        return dailySchedule.toString();
    }
}
