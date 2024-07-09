package Week8.Tasks;

import java.util.ArrayList;

public class Task4 {

    public static void main(String[] args) {

        /*
         * 4. You are developing a restaurant management system and want to create a
         * Menu class. The Menu class should encapsulate a list of MenuItem objects.
         * Implement the Menu class with private instance variables for the menu items
         * and provide public methods to add and remove items from the menu. Ensure that
         * the list of menu items cannot be directly accessed or modified from outside
         * the class.
         */

        Menu m1 = new Menu();
        m1.addItemInMenu("test", 5);
        System.out.println(m1.getMenuItems());

    }

}

class Menu {

    private ArrayList<MenuItem> MenuItems = new ArrayList<MenuItem>();

    public ArrayList<MenuItem> getMenuItems() {
        return MenuItems;
    }

    public void addItemInMenu(String itemName, int quantitiy) {
        this.MenuItems.add(new MenuItem(itemName, quantitiy));
    }
}

class MenuItem {
    private String itemName;
    private int quantity;

    MenuItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "{itemName: " + this.itemName + ", " + "quantitiy: " + this.quantity + "}";
    }
}
