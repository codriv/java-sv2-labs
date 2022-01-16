package collectionsmap;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassTrip {

    private Map<String, Integer> payments = new HashMap<>();

    public Map<String, Integer> getPayments() {
        return payments;
    }

    public void loadInpayments(Path path) {
        try(Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                fillPayments(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void fillPayments (String line) {
        String[] parts = line.split(": ");
        String name = parts[0];
        int payment = Integer.parseInt(parts[1]);
        payments.put(name, payment);
    }
}