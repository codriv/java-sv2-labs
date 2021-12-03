package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final List<Rate> rates = new ArrayList<>();
    private long balance;

    static {
        rates.add(new Rate(Currency.HUF, 1));
        rates.add(new Rate(Currency.EUR, 363.51));
        rates.add(new Rate(Currency.CHF, 349.47));
        rates.add(new Rate(Currency.GBP, 427.44));
        rates.add(new Rate(Currency.USD, 321.72));
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public CreditCard(long balance, Currency currency) {
        this.balance = Math.round(balance * getConversionFactor(currency));
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount) {
        if (amount < getBalance()) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean payment(long amount, Currency currency) {
        return payment(Math.round(amount * getConversionFactor(currency)));
    }

    private double getConversionFactor(Currency currency){
        double conversionFactor=0D;
        for(Rate rate:rates){
            if(rate.getCurrency() == currency){
                conversionFactor=rate.getConversionFactor();
            }
        }
        return conversionFactor;
    }
}