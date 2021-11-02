package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Proba {
    public static void main(String[] args) {
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
        int uniqueVariables = 0;
        for ( int i = 0; i < books.length - 1; i++) {
            boolean equal = false;
            for ( int j = 0; j < books.length; j++) {
                if (j == i) {
                    j++;
                }
                equal = books[i] == books[j] ? true : equal;
                }
            uniqueVariables += equal == false ? 1 : 0;
            }
        System.out.println(uniqueVariables);
        System.out.println(Arrays.toString(books));
        List<Book> list = new ArrayList<>();
        list.add(new Book());
        System.out.println(list.toString());
        Book book8 = new Book();
        System.out.println(book8);
        book8 = new Book();
        System.out.println(book8);
    }
}

