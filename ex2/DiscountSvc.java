package enumration.ex2;


public class DiscountSvc {
    public int discount(ClassGrade classGrade, int price){

        int discountPercent = 0;

        if (classGrade == ClassGrade.BASIC){
            discountPercent = 5;
        } else if (classGrade == ClassGrade.GOLD){
            discountPercent = 10;
        } else if (classGrade == ClassGrade.DIAMOND){
            discountPercent = 15;
        } else {
            System.out.println("할인 없습니다.");
        }

        return price * discountPercent / 100;
    }
}
