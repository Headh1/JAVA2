package class1.ex1;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주문?");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] pro = new ProductOrder[n];
        for (int i = 0; i < pro.length; i++) {
            System.out.println((i+1)+"번째 주문");

            System.out.print("상품명: ");
            String proname =  scanner.nextLine();

            System.out.print("가격: ");
            int price =  scanner.nextInt();

            System.out.print("수량: ");
            int qu =  scanner.nextInt();

            scanner.nextLine();

            pro[i] = createPro(proname,price,qu);
        }

        printPro(pro);
    }

    static ProductOrder createPro (String name , int price , int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = name;
        product.price = price;
        product.quantity = quantity;

        return product;
    }

    static void printPro (ProductOrder[] pro) {
        for (ProductOrder p:pro){
            System.out.println("상품명:"+p.productName + " 가격:"+p.price + " 주문수량:"+p.quantity);
        }

        int allSum = 0;

        for(int i = 0; i<pro.length; i++) {
            allSum += pro[i].price * pro[i].quantity;
        }
        System.out.println("최종결제금액:"+allSum);

    }
}
