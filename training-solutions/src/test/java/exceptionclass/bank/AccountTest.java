package exceptionclass.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;

    @BeforeEach
    void init() {
        account = new Account("12345678-87654321-00000000", 300000);
    }

    @Test
    void subtract() {
        account.subtract(100000);
        assertEquals(200000, account.getBalance());
    }

    @Test
    void deposit() {
        account.deposit(200000);
        assertEquals(500000, account.getBalance());
    }

    @Test
    void wrongAmount() {
        InvalidAmountBankOperationException iaboe = assertThrows(InvalidAmountBankOperationException.class,
                () -> account.subtract(150000));
        assertEquals("150000.0 is more than max. subtract: 100000.0", iaboe.getMessage());
    }

    @Test
    void lowBalanceTest() {
        account.subtract(100000);
        account.subtract(100000);
        account.subtract(50000);
        LowBalanceBankOperationException lbboe = assertThrows(LowBalanceBankOperationException.class,
                () -> account.subtract(80000));
        assertEquals("80000.0 is more than balance: 50000.0", lbboe.getMessage());
    }
}