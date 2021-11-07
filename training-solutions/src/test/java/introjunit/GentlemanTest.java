package introjunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    public void testCreate(){
        Gentleman gentleman = new Gentleman();
        assertEquals("Hello Sándor", gentleman.sayHello("Sándor"));
        assertEquals("Hello Anonymous", gentleman.sayHello(null));
    }
}
