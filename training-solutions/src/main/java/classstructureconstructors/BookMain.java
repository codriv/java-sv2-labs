package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        System.out.println("\r\nBook Registration 1.0\r\n");
        System.out.println("A könyv adatai:\r\n");
        Book book = new Book("Karl May", "Winnetou");
        book.register("RK1893"); // ez működik setter-ként
        System.out.println(" szerző: " + book.getAuthor());
        System.out.println(" cím: " + book.getTitle());
        System.out.println(" regisztrációs szám: " + book.getRegNumber());
    }
}

