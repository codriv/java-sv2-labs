package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {

    @Test
    void amountTest() {

        Payable payable = new Amount();

        assertEquals(528, payable.getPayableAmount(528));
    }

    @Test
    void cashTest() {

        Payable payable = new Cash();

        assertEquals(530, payable.getPayableAmount(528));
        assertEquals(530, payable.getPayableAmount(532));
        assertEquals(525, payable.getPayableAmount(525));
        assertEquals(525, payable.getPayableAmount(527));
        assertEquals(530, payable.getPayableAmount(530));
    }

    @Test
    void bankAtmTest() {

        Payable payable = new BankAtm();

        assertEquals(1000, payable.getPayableAmount(632));
    }
}