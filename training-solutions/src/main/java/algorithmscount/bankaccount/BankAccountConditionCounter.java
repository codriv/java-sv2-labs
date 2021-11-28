package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {
    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int lowLimit) {
        int countWithBalanceGreaterThan = 0;
        for (BankAccount bankAccount: bankAccounts) {
            if (bankAccount.getBalance() > lowLimit) {
                countWithBalanceGreaterThan++;
            }
        }
        return countWithBalanceGreaterThan;
    }
}
