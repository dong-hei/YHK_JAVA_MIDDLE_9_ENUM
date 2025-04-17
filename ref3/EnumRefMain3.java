package enumration.ref3;


import static enumration.ref3.Grade.*;

public class EnumRefMain3 {
    public static void main(String[] args) {
        int price = 100000;

        DiscountSvc dSvc = new DiscountSvc();
        int basic = dSvc.discount(BASIC, price);
        int gold = dSvc.discount(GOLD, price);
        int diamond = dSvc.discount(DIAMOND, price);

        System.out.println("basic 등급 할인 금액 = " + basic);
        System.out.println("gold 등급 할인 금액 = " + gold);
        System.out.println("diamond 등급 할인 금액 = " + diamond);
    }
}
