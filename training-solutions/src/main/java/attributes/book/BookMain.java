package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Quo vadis");
        System.out.println(book.getTitle());
    }
}
