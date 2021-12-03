package defaultconstructor;

public enum CountryCode2 {
    HU(new int[] {1, 2, 3}), EN(new int[] {3, 2, 1}), US(new int[] {2, 3, 1});

    private int[] order;

    CountryCode2(int[] order) {
        this.order = order;
    }

    public int[] getOrder() {
        for (int i = 0; i < order.length; i++) {
            order[i] = order[i] - 1;
        }
        return order;
    }
}
