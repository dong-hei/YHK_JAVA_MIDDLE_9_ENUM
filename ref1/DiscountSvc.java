package enumration.ref1;



public class DiscountSvc {
    public int discount(ClassGrade classGrade, int price){

        int discountPercent = classGrade.getDiscountPercent();
        return price * discountPercent / 100;
    }
}
