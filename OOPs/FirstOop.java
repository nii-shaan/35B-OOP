package OOPs;

public class FirstOop {
    public static void main(String[] args) {

        // Person p1 = new Person();
        // p1.name = "Nishan";
        // p1.age = 20;
        // p1.gender = 'M';
        // p1.introduction();

        // Square s1 = new Square();
        // s1.sides = 10;
        // int s1Area = s1.area();
        // System.out.println(s1Area);
        // s1.addSides(2);

        // Rectangle r1 = new Rectangle();
        // r1.breadth = 20;
        // r1.length = 10;
        // int area = r1.areaOfRectangle();
        // double perimeter = r1.perimeterOfRectangle();
        // System.out.println("Area of Rectangle is " + area);
        // System.out.println("Perimeter of Rectangle is " + perimeter);

        Car carOne = new Car("Land Cruiser", "Toyota", 2003, "Black");
        carOne.start();
        carOne.stop();
        carOne.details();

        Car carTwo = new Car("CyberTruck", "Tesla", 2024, "Grey");
        carTwo.start();
        carTwo.modify("Green");
        carTwo.details();

        Car carThree = new Car("Porsche", "Porsche", 100, "Green");
        carThree.start();
        carThree.expiry();
        carThree.details();
    }
}

class Person {

    // *data/fields/attributes/properties */
    String name;
    int age;
    char gender;

    // *procedures/functions/methods */

    void introduction() {
        System.out.println("Hi my name is " + name);
    }

}

class Square {
    int sides;

    int area() {
        int area = sides * sides;
        return area;

    };

    void addSides(int val) {
        sides = sides + val;
    }
}

/*
 * Task
 * make a class Rectangle
 * make a function areaOfRectangle that returns length * breadth
 * make a function perimeterOfRectangle that returns 2(length + breadth)
 * make an object of Rectangle and print area and perimeter
 */

class Rectangle {
    int length;
    int breadth;

    int areaOfRectangle() {
        return length * breadth;
    }

    double perimeterOfRectangle() {
        return 2 * (length + breadth);
    }
}

/*
 * Make attributes : name,brand,year,color
 * make a function modify() that takes new color and set to old color
 * make a function expiry() that return 100 added to year
 * make a function start() that prints (name is starting)
 * make a function stop() that print(name,brand is stopping)
 * make a function detail() that print(name,brand,color and year)
 * make 3 object of car
 * stop only 1st object
 * modify 2nd car to green color
 * print the expiry of 3rd object
 * print detail of all 3 object
 */

class Car {
    String name;
    String brand;
    int year;
    String color;

    Car(String name, String brand, int year, String color) {
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.color = color;

    }

    void modify(String new_color) {
        this.color = new_color;
    }

    int expiry() {
        return this.year + 100;
    }

    void start() {
        System.out.println(this.name + " is starting");
    }

    void stop() {
        System.out.println(this.name + " is stoping");
    }

    void details() {
        System.out.println("Name: " + this.name);
        System.out.println("Brand: " + this.brand);
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
    }

}