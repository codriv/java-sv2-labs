package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {
    public int countEntryLessThan(List<Transaction> transactions, int bound) {
        int transactionCounter = 0;
        for (Transaction transaction: transactions) {
            if (transaction.isCredit() && transaction.getAmount() < bound) {
                transactionCounter++;
            }
        }
        return transactionCounter;
    }
}
