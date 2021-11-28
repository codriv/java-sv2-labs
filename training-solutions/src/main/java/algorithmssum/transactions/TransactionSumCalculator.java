package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {
    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int sumAmountOfCreditEntries = 0;
        for (Transaction transaction: transactions) {
            if (transaction.getTransactionOperation() == TransactionOperation.CREDIT) {
                sumAmountOfCreditEntries += transaction.getAmount();
            }
        }
        return sumAmountOfCreditEntries;
    }
}
