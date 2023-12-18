package poly.ex2.pay1;

public class PayMain {
    public static void main(String[] args) {
        PayService payService = new PayService();

        String payOption1 ="kakao";
        int amount1 = 5000;
        payService.processPay(payOption1,amount1);

        String payOption2 ="naver";
        int amount2 = 15000;
        payService.processPay(payOption2,amount2);

        String payOption3 ="bad";
        int amount3 = 25000;
        payService.processPay(payOption3,amount3);
    }
}
