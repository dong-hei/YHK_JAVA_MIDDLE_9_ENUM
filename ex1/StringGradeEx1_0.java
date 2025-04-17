package enumration.ex1;


public class StringGradeEx1_0 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountSvc dSvc = new DiscountSvc();
        int basic = dSvc.discount(StringGrade.BASIC, price);
        int gold = dSvc.discount(StringGrade.GOLD, price);
        int diamond = dSvc.discount(StringGrade.DIAMOND, price);

        System.out.println("basic 등급 할인 금액 = " + basic);
        System.out.println("gold 등급 할인 금액 = " + gold);
        System.out.println("diamond 등급 할인 금액 = " + diamond);
    }
}
