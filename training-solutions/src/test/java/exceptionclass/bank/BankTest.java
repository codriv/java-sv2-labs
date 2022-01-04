package exceptionclass.bank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    List<Account> accountList = List.of(
            new Account("12345678-87654321-00000000", 300000),
            new Account("12346541-87654321-00000000", 200000),
            new Account("12345678-78962154-00000000", 500000),
            new Account("12345678-87654321-13654914", 800000));
    Bank bank = new Bank(accountList);

    @Test
    void findAccount() {
        InvalidAccountNumberBankOperationException ianboe = assertThrows(InvalidAccountNumberBankOperationException.class,
                () -> bank.deposit("65498132-98745632-12398745", 200000));
        assertEquals("Account not found: 65498132-98745632-12398745", ianboe.getMessage());
    }

    @Test
    void accountListNull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> new Bank(null));
        assertEquals("AccountList can not be null or empty!", iae.getMessage());
    }

    @Test
    void deposit() {
        bank.deposit("12346541-87654321-00000000", 50000);
        assertEquals(250000.0, bank.findAccount("12346541-87654321-00000000").getBalance());
    }

    @Test
    void subtract() {
        bank.subtract("12345678-78962154-00000000", 50000);
        assertEquals(450000.0, bank.findAccount("12345678-78962154-00000000").getBalance());
    }
}