package enumration.ex2;

/***
 * 한계 : 임의로 생성자를 만들 수 있음.
 */
public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 100000;

        DiscountSvc dSvc = new DiscountSvc();

        //private 생성자를 만들어서 제한을 둔다.
//        ClassGrade classGrade = new ClassGrade();
//        int result = dSvc.discount(classGrade, price);

//        System.out.println("classGrade 등급의 할인 금액 : " + result);
    }
}
