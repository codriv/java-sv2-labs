package finalmodifier;

public class TaxCalculator {
    public static final int TAX = 27;
    double tax(double price) {
        return price * TAX;
    }
    double priceWithTax(double price) {
        return price * (1 + (TAX / 100));
    }
}
