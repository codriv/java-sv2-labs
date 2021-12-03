package defaultconstructor;

public enum CountryCode3 {
    HU("ymd"), EN("dmy"), US("mdy");

    String orderString;
    int y = 1;
    int m = 2;
    int d = 3;
    int[] order = new int[3];

    CountryCode3(String orderString) {
        this.orderString = orderString;
    }

    public int[] getOrder() {
        for (int i = 0; i < orderString.length(); i++) {
            setOrder(i);
        }
        return order;
    }

    private void setOrder(int i) {
        switch (orderString.substring(i, i + 1 )) {
            case "y": order[i] = y - 1 ;
                break;
            case "m": order[i] = m - 1;
                break;
            case "d": order[i] = d - 1;
       }
    }
}