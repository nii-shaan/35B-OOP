
public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(20);
        System.out.println("Area of c1: " + c1.area());
        System.out.println("Perimeter of c1: " + c1.perimeter());

        Rectangle r1 = new Rectangle(20, 10);
        System.out.println("Area of r1: " + r1.area());
        System.out.println("Perimeter or r1: " + r1.perimeter());

        Square s1 = new Square(18);
        System.out.println("Area of s1: " + s1.area());
        System.out.println("Perimeter of s1: " + s1.perimeter());

    }
}

abstract class Shape {
    abstract public double area();

    abstract public double perimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return this.length * this.breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (this.length + this.breadth);
    }
}

class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double perimeter() {
        return Math.pow(this.side, 4);
    }

}