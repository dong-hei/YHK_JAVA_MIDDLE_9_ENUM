package enumration.ref3;

public enum Grade {
    BASIC(5), GOLD(10), DIAMOND(15), PLATINUM(20);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int discount(int price){
        return price * discountPercent / 100;
    }
}
