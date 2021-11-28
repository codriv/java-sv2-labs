package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {
    List<Salesperson> salespersonList = Arrays.asList(
            new Salesperson("Nagy Sándor", 1_200_000, 1_000_000),
            new Salesperson("Kis Mari", 1_360_000, 1_100_000),
            new Salesperson("Fekete Péter", 600_000, 900_000),
            new Salesperson("Zöld Piroska", 1_500_000, 1_500_000),
            new Salesperson("Futaki Bátor", 1_150_000, 1_200_000)
    );

    Salesperson salesPersonWithMaxSalesAmountExcepted = salespersonList.get(3);
    String nameOfsalesPersonWithMaxSalesAmountExcepted = salespersonList.get(3).getName();
    Salesperson salesPersonWithFurthestAboveTargetExpected = salespersonList.get(1);
    String nameOfsalesPersonWithFurthestAboveTargetExpected = salespersonList.get(1).getName();
    Salesperson salesPersonWithFurthestBelowTargetExpected = salespersonList.get(2);
    String nameOfsalesPersonWithFurthestBelowTargetExpected = salespersonList.get(2).getName();

    Sales sales = new Sales();

    @Test
    void testSelectSalesPersonWithMaxSalesAmount() {
        Salesperson salesPersonWithMaxSalesAmountActual = sales.selectSalesPersonWithMaxSalesAmount(salespersonList);
        assertEquals(salesPersonWithMaxSalesAmountExcepted, salesPersonWithMaxSalesAmountActual);
        String nameOfsalesPersonWithMaxSalesAmountActual = sales.selectSalesPersonWithMaxSalesAmount(salespersonList).getName();
        assertEquals(nameOfsalesPersonWithMaxSalesAmountExcepted, nameOfsalesPersonWithMaxSalesAmountActual);
    }

    @Test
    void testSelectSalesPersonWithFurthestAboveTarget() {
        Salesperson salesPersonWithFurthestAboveTargetActual = sales.selectSalesPersonWithFurthestAboveTarget(salespersonList);
        assertEquals(salesPersonWithFurthestAboveTargetExpected, salesPersonWithFurthestAboveTargetActual);
        String nameOfsalesPersonWithFurthestAboveTargetActual = sales.selectSalesPersonWithFurthestAboveTarget(salespersonList).getName();
        assertEquals(nameOfsalesPersonWithFurthestAboveTargetExpected, nameOfsalesPersonWithFurthestAboveTargetActual);
    }

    @Test
    void testSelectSalesPersonWithFurthestBelowTarget() {
        Salesperson salesPersonWithFurthestBelowTargetActual = sales.selectSalesPersonWithFurthestBelowTarget(salespersonList);
        assertEquals(salesPersonWithFurthestBelowTargetExpected, salesPersonWithFurthestBelowTargetActual);
        String nameOfsalesPersonWithFurthestBelowTargetActual = sales.selectSalesPersonWithFurthestBelowTarget(salespersonList).getName();
        assertEquals(nameOfsalesPersonWithFurthestBelowTargetExpected, nameOfsalesPersonWithFurthestBelowTargetActual);
    }
}