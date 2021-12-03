package defaultconstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {

    SimpleDateFormatter simpleDateFormatter = new SimpleDateFormatter();
    SimpleDate simpleDate = new SimpleDate();

    @Test
    void testFormatDateString() {
        simpleDate.setDate(1952, 3, 5);
        System.out.println(simpleDateFormatter.formatDateString(simpleDate));
        assertEquals("1952-3-5", simpleDateFormatter.formatDateString(simpleDate));
    }

    @Test
    void testFormatDateStringByCountryCode() {
        simpleDate.setDate(1952, 3, 5);
        assertEquals("3-5-1952", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.US, simpleDate));
        assertEquals("1952-3-5", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.HU, simpleDate));
        assertEquals("5-3-1952", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.EN, simpleDate));
    }

    @Test
    void testFormatDateStringByCountryCode2() {
        simpleDate.setDate(1952, 3, 5);
        assertEquals("3-5-1952", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.US, simpleDate));
        assertEquals("1952-3-5", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.HU, simpleDate));
        assertEquals("5-3-1952", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.EN, simpleDate));

    }

    @Test
    void testFormatDateStringByCountryCode3() {
        simpleDate.setDate(1952, 3, 5);
        assertEquals("3-5-1952", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.US, simpleDate));
        assertEquals("1952-3-5", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.HU, simpleDate));
        assertEquals("5-3-1952", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.EN, simpleDate));
    }

    @Test
    void testFormatDateStringByCountryCode4() {
        simpleDate.setDate(1952, 3, 5);
        assertEquals("3-5-1952", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.US, simpleDate));
        assertEquals("1952-3-5", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.HU, simpleDate));
        assertEquals("5-3-1952", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.EN, simpleDate));
    }

    @Test
    void testFormatDateStringByCountryCode5() {
        simpleDate.setDate(1952, 3, 5);
        assertEquals("3-5-1952", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.US, simpleDate));
        assertEquals("1952-3-5", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.HU, simpleDate));
        assertEquals("5-3-1952", simpleDateFormatter.formatDateStringByCountryCode(CountryCode.EN, simpleDate));
    }
}