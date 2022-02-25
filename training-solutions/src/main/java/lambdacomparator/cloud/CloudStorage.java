package lambdacomparator.cloud;

public class CloudStorage implements Comparable<CloudStorage> {

    private String provider;
    private int space;
    private PayPeriod payPeriod = PayPeriod.MONTHLY;
    private double price = 0;

    public CloudStorage(String provider, int space, PayPeriod payPeriod, double price) {
        this.provider = provider;
        this.space = space;
        this.payPeriod = payPeriod;
        this.price = price;
    }

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public PayPeriod getPayPeriod() {
        return payPeriod;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(CloudStorage o) {
        return (int)Math.round((((12 / payPeriod.getLength()) * price / (space / 1000)) - ((12 / o.payPeriod.getLength()) * o.price / (o.space / 1000))) * 100);
    }
}
