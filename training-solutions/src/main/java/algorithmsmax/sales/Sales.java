package algorithmsmax.sales;

import java.util.List;

public class Sales {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson salespersonMax = sales.get(0);
        for (Salesperson salesperson: sales) {
            if (salesperson.getAmount() > salespersonMax.getAmount()) {
                salespersonMax = salesperson;
            }
        }
        return salespersonMax;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson salespersonMax = sales.get(0);
        for (Salesperson salesperson: sales) {
            int salespersonPlus = salesperson.getAmount() - salesperson.getTarget();
            int salespersonMaxPlus = salespersonMax.getAmount() - salespersonMax.getTarget();
            if (salespersonPlus > salespersonMaxPlus) {
                salespersonMax = salesperson;
            }
        }
        return salespersonMax;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson salespersonMin = sales.get(0);
        for (Salesperson salesperson: sales) {
            int salespersonPlus = salesperson.getTarget() - salesperson.getAmount();
            int salespersonMaxPlus = salespersonMin.getTarget() - salespersonMin.getAmount();
            if (salespersonPlus > salespersonMaxPlus) {
                salespersonMin = salesperson;
            }
        }
        return salespersonMin;
    }
}
