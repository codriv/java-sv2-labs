package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {
//    private Path path = Paths.get("src/test/resources/introexceptionwritefiletestjunit4/books.txt");

//    public List<String> getRegister() {
    public List<String> getRegister(Path path) {
        try {
//            return Files.readAllLines(this.path);
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }

//    public List<String> getListOfBooks() {
    public List<String> getListOfBooks(List<String> register) {
        List<String> books = new ArrayList<>();
//        for (String book: getRegister(this.path)) {
        for (String book: register) {
            String[] details = book.split(";");
            books.add(details[2] + ": " + details[1]);
        }
        return books;
    }

//    public void writeFile() {
    public void writeFile(List<String> books, Path path) {
        try {
//            Files.write(this.path, getListOfBooks(getRegister(this.path)));
            Files.write(path, books);
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}