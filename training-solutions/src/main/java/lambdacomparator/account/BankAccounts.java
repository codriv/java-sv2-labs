package lambdacomparator.account;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BankAccounts {

    private List<BankAccount> bankAccounts;

    public BankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public List<BankAccount> listBankAccountsByAccountNumber(List<BankAccount> bankAccounts) {
        List<BankAccount> sorted = new ArrayList<>(bankAccounts);
        sorted.sort(Comparator.naturalOrder());
        return sorted;
    }

    public List<BankAccount> listBankAccountsByBalance(List<BankAccount> bankAccounts) {
        List<BankAccount> sorted = new ArrayList<>(bankAccounts);
        sorted.sort(Comparator.comparing(BankAccount::getBalance, Comparator.comparingInt(Math::abs)));
        return sorted;
    }

    public List<BankAccount> listBankAccountsByBalanceDesc(List<BankAccount> bankAccounts) {
        List<BankAccount> sorted = new ArrayList<>(bankAccounts);
        sorted.sort(Comparator.comparingInt(BankAccount::getBalance).reversed());
        return sorted;
    }

    public List<BankAccount> listBankAccountsByNameThenAccountNumber(List<BankAccount> bankAccounts) {
        List<BankAccount> sorted = new ArrayList<>(bankAccounts);
        sorted.sort(Comparator.comparing(BankAccount::getNameOfOwner, Comparator.nullsFirst(Comparator.naturalOrder())).thenComparing(BankAccount::getAccountNumber));
        return sorted;
    }
}
