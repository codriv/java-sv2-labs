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
    }

    @Test
    void testFormatDateStringByCountryCode() {
        simpleDate.setDate(1952, 3, 5);
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode(CountryCode.US, simpleDate));
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode(CountryCode.HU, simpleDate));
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode(CountryCode.EN, simpleDate));
    }

    @Test
    void testFormatDateStringByCountryCode2() {
        simpleDate.setDate(1952, 3, 5);
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode2(CountryCode2.US, simpleDate));
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode2(CountryCode2.HU, simpleDate));
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode2(CountryCode2.EN, simpleDate));

    }

    @Test
    void testFormatDateStringByCountryCode3() {
        simpleDate.setDate(1952, 3, 5);
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode3(CountryCode3.US, simpleDate));
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode3(CountryCode3.HU, simpleDate));
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode3(CountryCode3.EN, simpleDate));
    }

    @Test
    void testFormatDateStringByCountryCode4() {
        simpleDate.setDate(1952, 3, 5);
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode4(CountryCode.US, simpleDate));
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode4(CountryCode.HU, simpleDate));
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode4(CountryCode.EN, simpleDate));
    }

    @Test
    void testFormatDateStringByCountryCode5() {
        simpleDate.setDate(1952, 3, 5);
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode5(CountryCode.US, simpleDate));
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode5(CountryCode.HU, simpleDate));
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode5(CountryCode.EN, simpleDate));
    }
}