package enumration.ref2;

public enum Grade {
    BASIC(5), GOLD(10), DIAMOND(15);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }
}
