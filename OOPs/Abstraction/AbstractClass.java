package OOPs.Abstraction;

public class AbstractClass {
    public static void main(String[] args) {

        // Apple a = new Apple();
        // a.sms();
        // a.call("1234567890");

        Circle c = new Circle();
        System.out.println("Area of Circle: " + c.calculateArea());
        System.out.println("Perimeter of Circle: " + c.calculatePerimeter());

        Rectangle r = new Rectangle();
        System.out.println("Area of Rectangle: " + r.calculateArea());
        System.out.println("Perimeter of Rectangle: " + r.calculatePerimeter());

        Triangle t = new Triangle();
        System.out.println("Area of Triangle: " + t.calculateArea());
        System.out.println("Perimeter of Triangle: " + t.calculatePerimeter());

    }
}

// * To make abstract class keyword "abstract " before "class"
// * If you make abstract classm cannot make object of it

abstract class SmartPhone {
    // * abstract class may or may not contain abstract functions
    // * to make abstract function use "abstract" before makeing function
    // * abstract class do not have a body

    abstract void sms();

    abstract public boolean call(String number);

    void imei() {
        System.out.println("Imei number");
    }

}

// * Abstract class can only be used in sub/child class
class Samsung extends SmartPhone {
    // ^when extending abstract class we have to implement/override
    // ^ ALl the abstract function of abstract
    @Override // *Denotes that im overiding my parents class function/method */
    void sms() {
        System.out.println("Samsung way of sending sms");
    }

    @Override
    public boolean call(String number) {
        System.out.println("Samsung calling to " + number);
        return true;
    }
}

/*
 * Make a class Apple Extending Smartphone
 * make object of samsung an Apple
 * call sms() and call() function of them
 */

class Apple extends SmartPhone {
    @Override
    void sms() {
        System.out.println("Apple way of sending sms");
    }

    @Override
    public boolean call(String number) {
        System.out.println("Apple calling to " + number);
        return true;
    }
}

/*
 * You are building a shape hierarchy for a drawing application.
 * Design an abstract class named "Shape" with the following abstract methods:
 * 
 * calculateArea():
 * this method should calculate and return the area of the shape.
 * 
 * calculatePerimeter():
 * this method should calculate and return the perimeter of the shape.
 * 
 * Implement the abstract class and provide concrete implementation for:
 * the abstract methods. Create subclasses for different shapes such as
 * "Circle", "Rectangle", and "Triangle".
 * 
 * Each subclass should provide specific implementations for
 * calculating the area and perimeter of that shape.
 * Create instances of each shape class and demonstrate
 * how you can caluclate their respective areas and perimeteres
 */

abstract class Shape {

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Circle extends Shape {
    int radius = 20;

    @Override
    double calculateArea() {
        return (Math.PI * (radius * radius));
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    int length = 20;
    int breadth = 10;

    @Override
    double calculateArea() {
        return length * breadth;

    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Triangle extends Shape {

    int base = 15;
    int height = 20;

    int sideA = 15;
    int sideB = 20;
    int sideC = 25;

    @Override
    double calculateArea() {
        return 0.5 * base * height;

    }

    @Override
    double calculatePerimeter() {
        return (sideA + sideB + sideC);
    }

}