package OOPs.Encapsulation;

public class EncapsulationClass {
    public static void main(String[] args) {

        Laptop deviceOne = new Laptop("Asus", "Zenbook");
        deviceOne.year = 2015;
        deviceOne.setPrice(200000);
        deviceOne.setRam(16);
        deviceOne.setStorage(1000);
        deviceOne.printDetails();

        Laptop deviceTwo = new Laptop("Lenovo", "Legion");
        deviceTwo.year = 2000;
        deviceTwo.setPrice(250000);
        deviceTwo.setRam(16);
        deviceTwo.setStorage(2000);
        deviceTwo.printDetails();

    }
}

/*
 * 1. Encapsulation enclose/bundles similar properties/attribute
 * and function/methods inside a single class
 */

// class Laptop {
// String brand;
// String name;
// // * 2. Data hiding can be done using private modifier

// private double price;
// private int ram;
// private int storage;
// public int year;

// // *3. Data attributes can have a better control using setter/getter
// // * Write only using settter;

// public void setPrice(double price) {
// this.price = price;
// }

// // * Read only using getter
// public double getPrice() {
// return this.price;
// }

// void branding() {
// System.out.println("Brand: " + this.brand);
// }

// }

/*
 * Task
 * Make a consttuctior of Laptop that takes brand and name
 * Make a setter and getter for remaining private attributes, ram, storage
 * Make a function upgrade() takes, 2 number for ram and storage
 * and add them to the current value of ram and storage
 * Make a function inflation() takes 1 number price
 * and add to the current value of price
 * Make 2 object, fill the attribute and call upgrade & inflation
 * Print the following
 * Output:
 * Brand: Apple
 * Name: Apple Air M3
 * Price: 150000
 * Ram: 10GB
 * Storage: 256GB
 * year: 2022
 */

class Laptop {

    String brand;
    String name;

    private double price;
    private int ram;
    private int storage;
    public int year;

    Laptop(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void upgrade(int ram, int storage) {
        this.ram += ram;
        this.storage += storage;
    }

    public void inflation(double number) {
        this.price += number;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // * Read only using getter
    public double getPrice() {
        return this.price;
    }

    void branding() {
        System.out.println("Brand: " + this.brand);
    }

    void printDetails() {

        System.out.println("Brand: " + this.brand);
        System.out.println("Name: " + this.name);
        System.out.println("Year: " + this.year);
        System.out.println("Price: " + this.price);
        System.out.println("Ram: " + this.ram);
        System.out.println("Storage: " + this.storage);
    }
}