package defaultconstructor;

public enum CountryCode3 {
    HU("ymd"), EN("dmy"), US("mdy");

    String orderString;
    int[] order = new int[3];

    CountryCode3(String orderString) {
        this.orderString = orderString;
        setOrder();
    }

    public int[] getOrder() {
        return order;
    }

    public void setOrder() {
        for (int i = 0; i < orderString.length(); i++) {
            String letter = orderString.substring(i, i + 1 );
            order[i] = getValue(letter);
        }
    }

    private int getValue(String letter) {
        switch (letter) {
            case "y": return 0;
            case "m": return 1;
            case "d": return 2;
       }
       return 0;
    }
}