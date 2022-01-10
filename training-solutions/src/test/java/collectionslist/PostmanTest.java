package collectionslist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostmanTest {

    @Test
    void addAddress() {
        Postman postman = new Postman();
        postman.addAddress("cim_1");
        postman.addAddress("cim_2");
        postman.addAddress("cim_3");
        assertEquals(3, postman.getAddresses().size());
        assertEquals("cim_1", postman.getAddresses().get(0));
        assertEquals("cim_3", postman.getAddresses().get(2));
    }

    @Test
    void removeAddress() {
        Postman postman = new Postman();
        postman.addAddress("cim_1");
        postman.addAddress("cim_2");
        postman.addAddress("cim_3");
        postman.removeAddress("cim_1");
        assertEquals(2, postman.getAddresses().size());
        assertEquals("cim_2", postman.getAddresses().get(0));
    }
}