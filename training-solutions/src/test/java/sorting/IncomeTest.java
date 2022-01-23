package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    @Test
    void getHighestIncome() {
        int[] incomes = {1000, 2000, 5000, 4000, 3000, 1500};
        assertEquals(5000, new Income(incomes).getHighestIncome());
    }
}