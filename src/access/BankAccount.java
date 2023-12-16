package access;

public class BankAccount {
    private int balance;

     public BankAccount(){
         balance =0;
     }

     public void deposit(int amount) {
         if(isAmountValid(amount)) {
             balance += amount;
         } else{
             System.out.println("금액 이상함");
         }
     }

     public void withdraw(int amount){
         if (isAmountValid(amount) && balance - amount >= 0) {
             balance -= amount;
         } else {
             System.out.println("이상한금액 아냐? 그럼 잔액 부족");
         }
         }

     public int getBalance() {
         return balance;
     }

     private boolean isAmountValid(int amount) {
         return amount >0;
     }



}
