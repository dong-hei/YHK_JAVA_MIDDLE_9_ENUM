package enumration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        
        //모든 Enum 반환
        Grade[] values = Grade.values();
        System.out.println("Arrays.toString(val) = " + Arrays.toString(values));
        for (Grade val : values) {
            System.out.println("name = " + val.name() + ", ordinal = " + val.ordinal() );
        } //name() Enum 상수의 이름을 문자열로 반환, ordinal() Enum의 상수 선언 순서를 반환
        //ordinal()은 가급적 쓰지마라 => 상수 선언 위치가 변경되면 전체 상수 위치가 모두 변경될 수 있다.

        //String -> Enum 변환, 잘못된 문자면 IllegalArgEx 발생!
        String input = "GOLD";
        Grade gold = Grade.valueOf(input); // 이름과 일치하는 Enum 상수 반환
        System.out.println("gold = " + gold);
    }
}
