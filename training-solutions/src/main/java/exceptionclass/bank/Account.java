package exceptionclass.bank;

public class Account {

    private  String accountNumber;
    private double balance;
    private double maxSubtract = 100000;

    public Account(String accountNumber, double balance) {
        this.accountNumber = validateAccountNumber(accountNumber);
        this.balance = balance;
        maxSubtract = 100000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        this.maxSubtract = maxSubtract;
    }

    private String validateAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("AccountNumber can not be null or empty!");
        }
        return accountNumber;
    }
    
    public void subtract(double subtract)  {
        if (subtract > this.maxSubtract) {
            throw new LowBalanceBankOperationException(subtract + " is more than balance: " + balance);
        }
        if (subtract > maxSubtract) {
            throw new InvalidAmountBankOperationException(subtract + " is more than max. subtract: " + maxSubtract);
        }
        balance -= subtract;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }
}
