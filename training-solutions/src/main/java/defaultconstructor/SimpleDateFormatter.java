package defaultconstructor;

public class SimpleDateFormatter {

    SimpleDate simpleDate = new SimpleDate();

    public SimpleDateFormatter(){

    }

    public String formatDateString(SimpleDate simpleDate) {
        return String.format("%d-%d-%d", simpleDate.getYear(), simpleDate.getMonth(), simpleDate.getDay());
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        int[] date = {simpleDate.getYear(), simpleDate.getMonth(), simpleDate.getDay()};
        int[][] code = {{0,1,2}, {2,1,0}, {1,2,0}};
        int[] country = code[countryCode.ordinal()];
        return String.format("%d-%d-%d", date[country[0]], date[country[1]], date[country[2]]);
    }
}
