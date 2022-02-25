package lambdacomparator.account;

import aaa.poli.B;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountsTest {


    List<BankAccount> testBankAccounts = List.of(
            new BankAccount("25639877", "Nagy Péter", 35622),
            new BankAccount("12549654", "Kék Sajt", 12500),
            new BankAccount("52634789", "Zöld Proska", -1500),
            new BankAccount("84563214", "Kék Sajt", 36587),
            new BankAccount("32589654", null, 1220) //"Piros Alma"
    );

    BankAccounts bankAccounts = new BankAccounts(testBankAccounts);

    @Test
    void listBankAccountsByAccountNumber() {
        assertEquals("12549654", bankAccounts.listBankAccountsByAccountNumber(testBankAccounts).get(0).getAccountNumber());
        assertEquals("84563214", bankAccounts.listBankAccountsByAccountNumber(testBankAccounts).get(4).getAccountNumber());
    }

    @Test
    void listBankAccountsByBalance() {
        assertEquals("32589654", bankAccounts.listBankAccountsByBalance(testBankAccounts).get(0).getAccountNumber());
        assertEquals("84563214", bankAccounts.listBankAccountsByBalance(testBankAccounts).get(4).getAccountNumber());

    }

    @Test
    void listBankAccountsByBalanceDesc() {
        assertEquals("84563214", bankAccounts.listBankAccountsByBalanceDesc(testBankAccounts).get(0).getAccountNumber());
        assertEquals("52634789", bankAccounts.listBankAccountsByBalanceDesc(testBankAccounts).get(4).getAccountNumber());
    }

    @Test
    void listBankAccountsByNameThenAccountNumber() {
        assertEquals("32589654", bankAccounts.listBankAccountsByNameThenAccountNumber(testBankAccounts).get(0).getAccountNumber());
        assertEquals("52634789", bankAccounts.listBankAccountsByNameThenAccountNumber(testBankAccounts).get(4).getAccountNumber());
    }
}