package enumration.ref3;


public class DiscountSvc {
    public int discount(Grade grade, int price){
        return grade.discount(price);
    }
}
