package initializer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    @Test
    void testCreate() {
        CreditCard creditCard = new CreditCard(1_000_000);
        assertEquals(1_000_000, creditCard.getBalance());
    }

    @Test
    void tetsCreateWithCurrency() {
        CreditCard creditCard = new CreditCard(1_000, Currency.CHF);
        assertEquals(349_470, creditCard.getBalance());
    }

    @Test
    void testPayment() {
        CreditCard creditCard = new CreditCard(1_000, Currency.GBP);
        assertEquals(427_440, creditCard.getBalance());
        creditCard.payment(100_000);
        assertEquals(327_440, creditCard.getBalance());
    }

    @Test
    void testPaymentWithCurrency() {
        CreditCard creditCard = new CreditCard(1_000, Currency.USD);
        assertEquals(321_720, creditCard.getBalance());
        assertFalse(creditCard.payment(1000, Currency.EUR));
        assertTrue(creditCard.payment(500, Currency.EUR));
        assertEquals(139_965, creditCard.getBalance());
    }
}