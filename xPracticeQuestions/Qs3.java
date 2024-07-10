package xPracticeQuestions;

import java.util.ArrayList;

/*
 * Create a ShoppingCart class to simulate an online shopping cart. the class should have the following attributes:
 * cartId, customerName, and items(a list of products). include methods to addItem(),removeItem(), and calculateTotal()
 * Implement functionality to create new shopping carts, add/remove items, and calculate the total cost of items in the cart
 */

public class Qs3 {
    public static void main(String[] args) {

        ShoppingCart s1 = new ShoppingCart();
        s1.addItem(1, "Fish", 1000);
        s1.showCart();

    }
}

class ShoppingCart {
    int cartId;
    String customerName;
    ArrayList<Item> ItemsList = new ArrayList<Item>();

    void addItem(int itemId, String name, double price) {
        ItemsList.add(new Item(itemId, name, price));
        System.out.println("{itemId: " + itemId + ", name: " + name + ", price: " + price + " } => Item added!");
    }

    void removeItem(int itemId) {
        

    }

    void calculateTotal() {

    }

    void showCart() {
        System.out.println("Cart: " + this.ItemsList);
    }

}

class Item {
    int itemId;
    String name;
    double price;

    Item(int itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {

        return "{ itemId: " + this.itemId + ", name: " + this.name + ", price: " + this.price + " }";
    }
}
