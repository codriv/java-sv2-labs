package enumabstract;

public enum Discount {

    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return pieces * price * 0.8;
        }
    },

    BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces <= 2) {
                return pieces * price * 0.75;
            } else {
                return price * (0.5 + (pieces - 1) * 0.75);
            }
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}