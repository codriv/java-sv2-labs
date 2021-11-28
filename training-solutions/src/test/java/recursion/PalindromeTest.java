package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome palindrome = new Palindrome();

    @Test
    void testPalindrome() {
        assertTrue(palindrome.isPalindrome("ss"));
        assertTrue(palindrome.isPalindrome("kék"));
        assertTrue(palindrome.isPalindrome("saas"));
        assertTrue(palindrome.isPalindrome("indulagörögaludni"));
        assertFalse(palindrome.isPalindrome("palindrome"));
    }
}