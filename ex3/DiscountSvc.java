package enumration.ex3;


import static enumration.ex3.Grade.*; // Enum을 쓰면 static import로 간결하게 사용가능하다

public class DiscountSvc {
    public int discount(Grade classGrade, int price){

        int discountPercent = 0;

        if (classGrade == BASIC){
            discountPercent = 5;
        } else if (classGrade == GOLD){
            discountPercent = 10;
        } else if (classGrade == DIAMOND){
            discountPercent = 15;
        } else {
            System.out.println("할인 없습니다.");
        }

        return price * discountPercent / 100;
    }
}
