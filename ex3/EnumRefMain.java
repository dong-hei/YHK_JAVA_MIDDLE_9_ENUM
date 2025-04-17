package enumration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass() );
        System.out.println("class GOLD = " + Grade.GOLD.getClass() );
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass() );

        System.out.println("ref BASIC = " + refVal(Grade.BASIC));
        System.out.println("ref BASIC = " + refVal(Grade.GOLD));
        System.out.println("ref BASIC = " + refVal(Grade.DIAMOND));
    }

    private static String refVal(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade)); // 참조값을 16진수 변환 및 참조값을 숫자로 반환
    }
}
