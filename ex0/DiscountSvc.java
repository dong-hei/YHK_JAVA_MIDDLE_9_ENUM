package enumration.ex0;

public class DiscountSvc {
    public int discount(String grade, int price){
        int discountPercent = 0;
        if (grade.equals("BASIC")){
            discountPercent = 5;
        } else if (grade.equals("GOLD")){
            discountPercent = 10;
        } else if (grade.equals("DIAMOND")){
            discountPercent = 15;
        } else{
            System.out.println(grade + " : 할인 없습니다.");
        }

        return price * discountPercent / 100;
    }
}
