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

    public String formatDateStringByCountryCode2(CountryCode2 countryCode, SimpleDate simpleDate) {
        int[] date = {simpleDate.getYear(), simpleDate.getMonth(), simpleDate.getDay()};
        int[] country = countryCode.getOrder();
        return String.format("%d-%d-%d", date[country[0]], date[country[1]], date[country[2]]);
    }


    public String formatDateStringByCountryCode3(CountryCode countryCode, SimpleDate simpleDate) {
        int[] date = {simpleDate.getYear(), simpleDate.getMonth(), simpleDate.getDay()};
        String[] formats = {"HU012", "EN210", "US120"};
        int[] country = new int[3];
        for (String format: formats) {
            if (format.startsWith(countryCode.name())) {
                for (int i = 0; i < 3; i++) {
                    country[i] = parse(format, i + 2);
                }
            }
        }
        return String.format("%d-%d-%d", date[country[0]], date[country[1]], date[country[2]]);
    }

    private int parse(String format, int index) {
        return Integer.parseInt(format.substring(index, index + 1));
    }


    public String formatDateStringByCountryCode4(CountryCode countryCode, SimpleDate simpleDate) {
        int[] date = {simpleDate.getYear(), simpleDate.getMonth(), simpleDate.getDay()};
        String[] formats = {"HU012", "EN210", "US120"};
        int[] country = null;
        for (String format: formats) {
            if (format.startsWith(countryCode.name())) {
                country = getOrder(format.substring(2));
            }
        }
        return String.format("%d-%d-%d", date[country[0]], date[country[1]], date[country[2]]);
    }

    private int[] getOrder(String orderString) {
        int[] order = new int[3];
        for (int i = 0; i < 3; i++) {
            order[0] = Character.getNumericValue(orderString.charAt(i));
        }
        return order;
    }
}
