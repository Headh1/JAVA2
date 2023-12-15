package class1.ex1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] pro = new ProductOrder[2];

        ProductOrder ts = new ProductOrder();
        ts.productName = "티셔츠";
        ts.price = 1000;
        ts.quantity = 2;
        pro[0] = ts;

        ProductOrder sk = new ProductOrder();
        sk.productName = "치마";
        sk.price = 2000;
        sk.quantity = 1;
        pro[1] = sk;

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
