package interfacedependencyinversion.amount;

public class Cash implements Payable{

    @Override
    public int getPayableAmount(int amount) {
        int remainder = amount % 5;
        return remainder < 3 ? amount - remainder : amount + 5 - remainder;
    }
}