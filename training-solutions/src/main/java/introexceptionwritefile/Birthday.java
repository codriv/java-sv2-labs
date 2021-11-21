package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    private List<String> names = new ArrayList<>();
    private Path path = Path.of("src/main/resources/introexceptionwritefile/birthdays.txt");
//    private Path path = Paths.get("src/main/resources/introexceptionwritefile/birthdays.txt");
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Birthday birthday = new Birthday();
        int numberOfNames = Integer.parseInt(birthday.getNumberOfNames());
        for (int i = 0; i < numberOfNames; i++) {
            String name = birthday.getName(i);
            String dateString = birthday.getDateString(name);
            String date = birthday.getDate(dateString).toString();
            birthday.names.add(name + ", született: " + date);
        }
        birthday.writeFile(birthday.path, birthday.names);
    }

    private String getNumberOfNames() {
        String input = "";
        while (!input.matches("\\d+") && input.matches("0*")) {
            System.out.print("Hány nevet szeretne megadni? ");
            input = scanner.nextLine();
        }
        return input;
    }

    private String getName(int count) {
        String name = "";
        while (name.isBlank()) {
            System.out.printf(" %d. név: ", count + 1);
            name = scanner.nextLine();
        }
        return name;
    }

    private String getDateString(String name) {
        String dateString = "";
        while (dateString.isBlank()) {
            System.out.printf("  %s születési dátuma [ÉÉÉÉ H N]: ", name);
            dateString = scanner.nextLine();
        }
        return dateString;
    }

    private LocalDate getDate(String dateString) {
        Scanner scDate = new Scanner(dateString);
        int year = scDate.nextInt();
        int month = scDate.nextInt();
        int day = scDate.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        return date;
    }

    private void writeFile(Path path, List<String> names) {
        try {
            Files.write(path, names);
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
