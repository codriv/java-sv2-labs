package statements;

public class Investment {
    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        active = true;
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }

    /* public int getInterestRate() {
           return interestRate;
       }
     */

    public double getYield(int days) {
        return (fund * ((double)interestRate / 100) / 365 * days);  // Lehet, hogy jobb lenne a kamatlábat (interestRate) egyből double típusúként definiálni?
    }

    public double close(int days) {
        double sum = active ? ((fund + this.getYield(days)) * (1 - (cost / 100))) : 0;
        active = false;
        return sum;
    }
}
