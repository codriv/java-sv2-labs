package exception.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        List<String> lines =  null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
        return lines;
    }

    public List<String> validate(List<String> lines) {
        List<String> wrongData = new ArrayList<>();
        for (String line: lines) {
            String[] parts = line.split(",");
            if(!(presentAll(parts) && numberValid(parts[0]) && numberValid(parts[1]) && nameValid(parts[2]))) {
                wrongData.add(line);
            }
        }
        return wrongData;
    }

    private boolean presentAll(String[] parts) {
        return parts.length != 3 ? false : true;
    }

    private boolean numberValid(String number) {
        boolean isValid = false;
        try {
            isValid = parse(number);
        } catch (NumberFormatException nfe) {
            System.out.printf("\"%s\" is not a number!\n", number);
        }
        return isValid;
    }

    private boolean parse (String number) throws NumberFormatException{
        if (number.contains(".")) {
            Double.parseDouble(number);
        } else {
            Integer.parseInt(number);
        }
        return true;
    }

    private boolean nameValid(String name) {
        return (name.isBlank() || name.split(" ").length < 2) ? false : true;
    }
}