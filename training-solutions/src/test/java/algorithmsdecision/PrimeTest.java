package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    Prime prime = new Prime();
    int primeNumber = 29;
    int notPrime = 40;

    @Test
    void testIsPrime() {
        assertTrue(prime.isPrime(primeNumber));
        assertFalse(prime.isPrime(notPrime));
    }

}