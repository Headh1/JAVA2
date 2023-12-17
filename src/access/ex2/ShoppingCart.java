package access.ex2;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {

        if (itemCount >= items.length) {
            System.out.println("장바구니 가득참");
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() + " 합계 : " + item.getSum());
        }
        System.out.println("전체합계 :" + total());
    }

    private int total() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            total += item.getSum();
        }
        return total;
    }
}
