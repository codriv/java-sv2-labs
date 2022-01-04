package exceptionclass.bank;

import java.util.List;

public class Bank {

    private List<Account> accountList;

    public Bank(List<Account> accountList) {
        this.accountList = validateAccountList(accountList);
    }

    private List<Account> validateAccountList (List<Account> accountList) {
        if (accountList == null || accountList.size() == 0) {
            throw new IllegalArgumentException("AccountList can not be null or empty!");
        }
        return accountList;
    }

    public void deposit (String accountNumber, double deposit) {
        findAccount(accountNumber).deposit(deposit);
    }

    public void subtract (String accountNumber, double subtract) {
        findAccount(accountNumber).subtract(subtract);
    }

    public Account findAccount (String accountNumber) {
        for (Account account: accountList) {
            if (accountNumber.equals(account.getAccountNumber())) {
                return account;
            }
        }
        throw new InvalidAccountNumberBankOperationException("Account not found: " + accountNumber);
    }
}
