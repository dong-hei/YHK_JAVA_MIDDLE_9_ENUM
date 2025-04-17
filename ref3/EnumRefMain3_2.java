package enumration.ref3;


import static enumration.ref3.Grade.*;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 100000;

        System.out.println("basic 등급 할인 금액 = " + BASIC.discount(price));
        System.out.println("gold 등급 할인 금액 = " + GOLD.discount(price));
        System.out.println("diamond 등급 할인 금액 = " + DIAMOND.discount(price));
    }
}
