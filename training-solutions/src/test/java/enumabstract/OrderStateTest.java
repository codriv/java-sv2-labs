package enumabstract;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

class OrderStateTest {

    @Test
    void orderStateTest() {
        assertTrue(OrderState.NEW.canDelete());
        assertTrue(OrderState.CONFIRMED.canDelete());
        assertTrue(OrderState.PREPARED.canDelete());
        assertFalse(OrderState.ONBOARD.canDelete());
        assertFalse(OrderState.DELIVERED.canDelete());
        assertFalse(OrderState.RETURNED.canDelete());
        assertFalse(OrderState.DELETED.canDelete());
    }
}