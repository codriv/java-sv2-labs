package staticattrmeth;

public class BankTransaction {

    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions;
    private static long sumOfTransactions;
    private static long currentMinValue;
    private static long currentMaxValue;
    public long transactionValue;

    public BankTransaction(long transactionValue) {
        if (MIN_TRANSACTION_VALUE > transactionValue || transactionValue > MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException(String.format(
                "The value of transaction must be between %d and %d!", MIN_TRANSACTION_VALUE, MAX_TRANSACTION_VALUE));
        }
        this.transactionValue = transactionValue;
        if (countOfTransactions == 0 || transactionValue < currentMinValue) {
            currentMinValue = transactionValue;
        }
        if (transactionValue > currentMaxValue) {
            currentMaxValue = transactionValue;
        }
        sumOfTransactions += transactionValue;
        countOfTransactions++;
//        currentMinValue = transactionValue < currentMinValue ? transactionValue : currentMinValue;
//        currentMaxValue = transactionValue > currentMaxValue ? transactionValue : currentMaxValue;
    }

    public static void initTheDay() {
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMinValue = 0;
        currentMaxValue = 0;
    }

    public static long getCountOfTransactions() {
        return countOfTransactions;
    }

    public static long getAverageOfTransaction() {
        return countOfTransactions == 0 ? 0 : sumOfTransactions / countOfTransactions;
    }

    public static long getCurrentMinValue() {
//        return currentMinValue;
        return countOfTransactions == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return countOfTransactions == 0 ? 0 : currentMaxValue;
    }

    public static long getSumOfTransactions() {
        return sumOfTransactions;
    }

    public long getTransactionValue() {
        return transactionValue;
    }
}
