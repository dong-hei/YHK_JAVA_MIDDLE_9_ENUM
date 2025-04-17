package enumration.ex1;


/**
 * 스태틱 문자열로 해놓긴했는데 dSvc.discount()안에 
 * grade로 String을 뜬금없는값을 써놓으면 답이없다.
 */
public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountSvc dSvc = new DiscountSvc();
        int basic = dSvc.discount("PLATINUM", price);
        int gold = dSvc.discount(StringGrade.GOLD, price);
        int diamond = dSvc.discount(StringGrade.DIAMOND, price);

        System.out.println("basic 등급 할인 금액 = " + basic);
        System.out.println("gold 등급 할인 금액 = " + gold);
        System.out.println("diamond 등급 할인 금액 = " + diamond);
    }
}
