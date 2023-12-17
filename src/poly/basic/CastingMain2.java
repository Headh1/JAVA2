package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();

        // 일시적인 캐스팅
        ((Child)poly).childMethod();
    }
}
