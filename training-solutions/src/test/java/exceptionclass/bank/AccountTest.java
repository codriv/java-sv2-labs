package exceptionclass.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account = new Account("12345678-87654321-00000000", 2000000);

    @Test
    void subtract() {
        account.subtract(100000);
        assertEquals(1900000, account.getBalance());
    }

    @Test
    void deposit() {
        account.deposit(200000);
        assertEquals(2200000, account.getBalance());
    }

    @Test
    void wrongAmount() {

    }
}