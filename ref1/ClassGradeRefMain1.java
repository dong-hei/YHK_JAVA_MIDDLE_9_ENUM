package enumration.ref1;



public class ClassGradeRefMain1 {
    public static void main(String[] args) {
        int price = 100000;

        DiscountSvc dSvc = new DiscountSvc();
        int basic = dSvc.discount(ClassGrade.BASIC, price);
        int gold = dSvc.discount(ClassGrade.GOLD, price);
        int diamond = dSvc.discount(ClassGrade.DIAMOND, price);

        System.out.println("basic 등급 할인 금액 = " + basic);
        System.out.println("gold 등급 할인 금액 = " + gold);
        System.out.println("diamond 등급 할인 금액 = " + diamond);
    }
}
