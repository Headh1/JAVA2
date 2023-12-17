package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역변수
        final int data1;
        data1 = 10;

        // 재할당 못함
        // data1 =20

        final int data2 = 20;
    }

    static void method(final int paramete) {
        // parameter =10;

    }
}
