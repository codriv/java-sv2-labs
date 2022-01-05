package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {

    public String getHiddenWord(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            return getLetters(scanner);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private String getLetters(Scanner scanner) {
        StringBuilder hiddenWord = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            hiddenWord.append(findLetter(line));
        }
        return hiddenWord.toString();
    }

    private String findLetter(String line) {
        for (char character: line.toCharArray()) {
            if (Character.isAlphabetic(character)) {
                String letter = String.valueOf(character);
                return letter;
            }
        }
        return " ";
    }
}