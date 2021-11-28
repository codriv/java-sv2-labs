package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {
    BankAccountDecisionMaker bankAccountDecisionMaker = new BankAccountDecisionMaker();
    List<BankAccount> accounts = Arrays.asList(
            new BankAccount("Nagy Sándor", "21546654-25896452-21548765", 1_254_456),
            new BankAccount("Kis Mari", "456132789-25498762-25964781", 1_456_987),
            new BankAccount("Fekete Péter", "21546654-25896452-21548765", 2_456_789)
    );
    int lowLimitTrue = 1_325_456;
    int lowLimitFalse = 4_325_456;

    @Test
    void testBankAccountDecisionMaker() {
        assertTrue(bankAccountDecisionMaker.containsBalanceGreaterThan(accounts, lowLimitTrue));
        assertFalse(bankAccountDecisionMaker.containsBalanceGreaterThan(accounts, lowLimitFalse));
    }

}