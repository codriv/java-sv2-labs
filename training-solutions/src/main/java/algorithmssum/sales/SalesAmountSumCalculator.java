package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {
    public int sumSalesAmount(List<Salesperson> salespersons) {
        int sumSalesAmount = 0;
        for (Salesperson salesperson: salespersons) {
            sumSalesAmount += salesperson.getAmount();
        }
        return sumSalesAmount;
    }
}
