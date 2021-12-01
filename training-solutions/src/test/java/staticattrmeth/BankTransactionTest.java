package staticattrmeth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {

    @BeforeEach
    void create() {
        BankTransaction.initTheDay();
        BankTransaction bankTransaction1 = new BankTransaction(5_000_000);
        BankTransaction bankTransaction2 = new BankTransaction(4_000_000);
        BankTransaction bankTransaction3 = new BankTransaction(7_000_000);
        BankTransaction bankTransaction4 = new BankTransaction(2_000_000);
        BankTransaction bankTransaction5 = new BankTransaction(1_000_000);
    }

    @Test
    void testGetCountOfTransactions() {
        assertEquals(5, BankTransaction.getCountOfTransactions());
    }
//
    @Test
    void testGetAverageOfTransaction() {
        assertEquals(3_800_000, BankTransaction.getAverageOfTransaction());
    }

    @Test
    void testGetCurrentMinValue() {
        assertEquals(1_000_000, BankTransaction.getCurrentMinValue());
    }

    @Test
    void testGetCurrentMaxValue() {
        assertEquals(7_000_000, BankTransaction.getCurrentMaxValue());

    }

    @Test
    void testGetSumOfTransactions() {
        assertEquals(19_000_000, BankTransaction.getSumOfTransactions());
    }

    @Test
    void testCreateOutOfRange() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new BankTransaction(15_000_000));
        assertEquals("The value of transaction must be between 1 and 10000000!", exception.getMessage());
    }
}