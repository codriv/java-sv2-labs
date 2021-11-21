package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    private List<String> todos = new ArrayList<>();
    private Path path = Paths.get("src/main/resources/introexceptionwritefile/todos.txt");

    public static void main(String[] args) {
        ToDo toDo = new ToDo();
        Scanner scanner = new Scanner(System.in);
        String todo = "";

        while (!todo.equals("x")) {
            System.out.print("Adja meg a következő teendőt! (kilépés: [x]): ");
            todo = scanner.nextLine();
            if (!todo.isBlank() && !todo.equals("x")) {
                toDo.todos.add(todo);
            } else {
                try {
                    Files.write(toDo.path, toDo.todos);
                }
                catch (IOException ioe) {
                    System.out.println(ioe.getMessage());
                }
            }
        }
    }
}
