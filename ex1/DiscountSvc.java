package enumration.ex1;

public class DiscountSvc {
    public int discount(String grade, int price){

        int discountPercent = 0;
        if (grade.equals(StringGrade.BASIC)){
            discountPercent = 5;
        } else if (grade.equals(StringGrade.GOLD)){
            discountPercent = 10;
        } else if (grade.equals(StringGrade.DIAMOND)){
            discountPercent = 15;
        } else{
            System.out.println(grade + " : 할인 없습니다.");
        }

        return price * discountPercent / 100;
    }
}
