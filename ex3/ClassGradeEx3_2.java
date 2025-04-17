package enumration.ex3;

import static enumration.ex3.Grade.*;

public class ClassGradeEx3_2 {
    public static void main(String[] args) {
        int price = 100000;

        DiscountSvc dSvc = new DiscountSvc();
//        Grade grade = new Grade(); // enum은 외부 생성이 불가능
        int diamond = dSvc.discount(DIAMOND, price);

        System.out.println("diamond 등급 할인 금액 = " + diamond);
    }
}
