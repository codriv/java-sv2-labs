package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class BooksTest {
    List<String> registerExpected = Arrays.asList("G 25;Egri csillagok;Gárdonyi Géza",
            "M 79;Pál utcai fiúk;Molnár Ferenc", "F 37;Tüskevár;Fekete István",
            "J 68;Kőszívű ember fiai;Jókai Mór");
    List<String> booksExpected = Arrays.asList("Gárdonyi Géza: Egri csillagok",
            "Molnár Ferenc: Pál utcai fiúk", "Fekete István: Tüskevár",
    "Jókai Mór: Kőszívű ember fiai");
    Path pathRead = Paths.get("src/test/resources/introexceptionwritefiletestjunit4/books.txt");
    Books books = new Books();

    @Test
    public void getRegisterTest() throws IOException {
        List<String> registerCreated = books.getRegister(pathRead);
        assertEquals(registerExpected, registerCreated);
    }

    @Test
    public void getListOfBooksTest() {
//        List<String> booksCreated = books.getListOfBooks(books.getRegister(pathRead));
        List<String> booksCreated = books.getListOfBooks(registerExpected);
        assertEquals(booksExpected, booksCreated);
    }

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();
    @Test
        public void writeFileTest() throws IOException {
            Path path = temporaryFolder.newFile("books.txt").toPath();
//            books.writeFile(books.getListOfBooks(books.getRegister(pathRead)), path);
            books.writeFile(booksExpected, path);
            List<String> listOfBooks = Files.readAllLines(path);
            assertEquals(booksExpected, listOfBooks);
    }
}