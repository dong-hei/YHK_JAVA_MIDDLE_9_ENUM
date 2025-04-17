package enumration.ex0;

/**
 * 타입안정성이 부족하고 데이터 일관성이 떨어지기에 다른 대안이 필요하다.
 */
public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountSvc dSvc = new DiscountSvc();
        int basic2 = dSvc.discount("BASIC", price);

        //실수로 소문자로 쳤다
        int basic = dSvc.discount("Basic", price);

        //실수로 오타를 냈다 (컴파일상 에러가 없다.)
        int gold = dSvc.discount("GOLLD", price);

        //실수로 존재하지 않는 등급을 입력했다 (컴파일상 에러가 없다.)
        int platinum = dSvc.discount("PLATINUM", price);

        System.out.println("basic 등급 할인 금액 (basic2) = " + basic2);
        System.out.println("basic 등급 할인 금액 = " + basic);
        System.out.println("gold 등급 할인 금액 = " + gold);
        System.out.println("platinum 등급 할인 금액 = " + platinum);
    }
}
