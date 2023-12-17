package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 정적 변수 , 메소드 접근
        staticValue++;
        staticMethod();;

        // 인스턴스 변수 , 메소드 접근 불가 complie error
        // instanceValue++;
        // instanceMethod();
    }

    public void instanceCall(){
        // 정적 변수,메소드 , 인스턴스 변수,메소드 접근 가능
        instanceValue++;
        instanceMethod();
        staticValue++;
        staticMethod();;
    }
    private void instanceMethod() {
        System.out.println("instanceValue = "+ instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = "+staticValue);
    }
}
