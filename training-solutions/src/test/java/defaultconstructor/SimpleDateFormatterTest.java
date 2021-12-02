package defaultconstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {

    SimpleDateFormatter simpleDateFormatter = new SimpleDateFormatter();
    SimpleDate simpleDate = new SimpleDate();

    @Test
    void formatDateString() {
        simpleDate.setDate(1952, 3, 5);
        System.out.println(simpleDateFormatter.formatDateString(simpleDate));
    }

    @Test
    void formatDateStringByCountryCode() {
        simpleDate.setDate(1952, 3, 5);
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode(CountryCode.US, simpleDate));
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode(CountryCode.HU, simpleDate));
        System.out.println(simpleDateFormatter.formatDateStringByCountryCode(CountryCode.EN, simpleDate));
    }
}