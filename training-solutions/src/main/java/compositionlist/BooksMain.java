package compositionlist;

import java.util.Scanner;

public class BooksMain {
    public static void main(String[] args) {
        System.out.println("Hány könycímet szeretne eltárolni?");
        Scanner scanner = new Scanner(System.in);
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();
        Books books = new Books();
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.print(i + 1 + ". könyv címe: ");
            books.addBook(scanner.nextLine());
        }

        System.out.println("\nKönyvlista:");
        System.out.println(books.getTitles());

        System.out.println("\nSzerző hozzáadásához először adja meg a címet!");
        String title = scanner.nextLine();
        System.out.println("Ki a megadott könyv szerzője?");
        String author = scanner.nextLine();

        books.findBookAndSetAuthor(title, author)
        ;
//        Books books = new Books();
//        books.addBook("Winnetou");
//        books.addBook("Egri csillagok");
//        books.addBook("Zsivago doktor");
//
//        System.out.println(books.getTitles());
//
//        System.out.println(books.getTitles().contains("Efri csillagok"));
//        System.out.println(books.getTitles().indexOf("Egri csillagok"));
//
//        books.findBookAndSetAuthor("Egri csillagok", "Gárdonyi Géza");
//        System.out.println(books.getTitles());
//
//        books.findBookAndSetAuthor("Bogáncs", "Fekete István");
        System.out.println("\nA lista:");
        System.out.println(books.getTitles());
    }
}
