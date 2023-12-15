package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account ac = new Account();

        ac.balance=0;

        int a = ac.deposit(10000);
        System.out.println("현재 잔액 : "+a);


        int b = ac.withdraw(9000);
        System.out.println("현재 잔액 : "+b);

        int c = ac.withdraw(2000);
        System.out.println("현재 잔액 : "+c);
    }
}
