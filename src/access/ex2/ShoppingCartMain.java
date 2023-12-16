package access.ex2;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("연어회",12000,2);
        Item item2 = new Item("방어회",22000,2);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();

    }
}
