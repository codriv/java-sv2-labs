package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        try {
           return getAmountsOfAid(path);
        } catch (IOException | NullPointerException | IndexOutOfBoundsException | NumberFormatException | ArithmeticException exception) {
            throw new IllegalStateException("Something went wrong while counting.", exception);
        }
    }

    private List<String> getAmountsOfAid(Path path) throws IOException {
        List<String> amountsOfAid = new ArrayList<>();
        for (String line : Files.readAllLines(path)) {
            String[] parts = line.split(": ");
            amountsOfAid.add(parts[0] + ": " + (amount / Integer.parseInt(parts[1])));
        }
        return amountsOfAid;
    }
}