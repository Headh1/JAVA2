package class1.ex1;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] pro = new ProductOrder[2];

        pro[0] =createPro("티셔츠",1000,2);
        pro[1] =createPro("치마",2000,3);

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
