package classstructureintegrate;

public class BankAccount {
    private String accountNumber, owner;
    private int balance;

    public BankAccount(String owner, String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getInfo() {
        return owner + " (" + accountNumber + "): " + balance + " Ft";
    }

    public int deposit(int plus) {
        return this.balance += plus;
    }

    public int withdraw(int minus) {
        return this.balance -= minus;
    }
}
