package Week7.Tasks;

public class Task1 {
    public static void main(String[] args) {

        //* Task 1
        Cirle c = new Cirle();
        c.setRadius(5);
        System.out.println("Area of circle: " + c.calculateArea());
        System.out.println("Circumference of circle: " + c.calculateCircumference());

    }
}

/*
 * 1. Write a Java program to create a class called "Circle" with a radius
 * attribute. You can access this attribute using setter and getter method.
 * Calculate the area and circumference of the circle.
 */

class Cirle {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

}
