package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectMain {
    public static void main(String[] args) {
        new Book();
        System.out.println(new Book());
        Book emptyBook;
        emptyBook = null;
        System.out.println(emptyBook);
        System.out.println(emptyBook == null ? "emptyBook is null" : "emptyBook is not null");
        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        Book anotherBook = new Book();
        System.out.println(book == anotherBook);
        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(book == anotherBook);

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;
        Book[] books = {book1, book2, book3, book4, book5, book6, book7};
        System.out.println(Arrays.toString(books));

        Book[] books2 = {book1, book2, book3};
        List<Book> list = Arrays.asList(book1, book2, book3);
        List<Book> list2 = new ArrayList<>();
        list2.add(book1);
        list2.add(book2);
        list2.add(book3);

        System.out.println();
        System.out.println(Arrays.toString(books2));
        System.out.println(list.toString());
        System.out.println(list2.toString());
    }
}
