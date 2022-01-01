package interfacedependencyinversion.amount;

public class BankAtm implements Payable{

    @Override
    public int getPayableAmount(int amount) {
        int remainder = amount % 1000;
        return amount + 1000 - remainder;
    }
}