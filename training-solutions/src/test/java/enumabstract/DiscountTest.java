package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void getAmountToPay() {
        assertEquals(8, Discount.SPECIAL_OFFER.getAmountToPay(10, 1));
        assertEquals(20, Discount.BLACK_FRIDAY_OFFER.getAmountToPay(10, 3));
    }
}