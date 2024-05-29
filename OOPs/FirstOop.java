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

        Rectangle r1 = new Rectangle();
        r1.breadth=20;
        r1.length=10;
        int area = r1.areaOfRectangle();
        double perimeter = r1.perimeterOfRectangle();
        System.out.println("Area of Rectangle is " + area);
        System.out.println("Perimeter of Rectangle is " + perimeter);


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