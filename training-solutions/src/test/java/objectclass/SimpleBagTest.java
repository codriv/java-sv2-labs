package objectclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBagTest {

    @Test
    void testSimpleBag() {
        SimpleBag simpleBag = new SimpleBag();
        simpleBag.putItem(new Beer("Becks", 500));
        simpleBag.putItem(new Book("Karl May", "Winnetou"));
        simpleBag.putItem(new Beer("Gold Fassl", 400));
        simpleBag.putItem(new Book("Borisz Paszternak", "Zsivago doktor"));
        simpleBag.putItem(new Beer("Radeberger", 600));
        simpleBag.putItem(new Book("J. D. Salinger", "Zabhegyező"));

        assertEquals(0, simpleBag.getCursor());
        assertEquals(6, simpleBag.size());
        assertEquals(6, simpleBag.size());
        System.out.println(simpleBag.next());
        assertEquals(1, simpleBag.getCursor());
        assertTrue(simpleBag.next().equals(new Book("Karl May", "Winnetou")));
        System.out.println(simpleBag.next());
        System.out.println(simpleBag.next());
        System.out.println(simpleBag.getCursor());
        assertTrue(simpleBag.next().equals(new Beer("Radeberger", 600)));
        simpleBag.next();
        assertFalse(simpleBag.hasNext());
        simpleBag.beforeFirst();
        assertTrue(simpleBag.next().equals(new Beer("Becks", 500)));
    }
}