package OOPs;

public class ConstructorClass {
    public static void main(String[] args) {
        // ConstructorExample ce = new ConstructorExample();
        // System.out.println("After object");

        // ParamConstructor pc = new ParamConstructor(10, 20);
        // System.out.println(pc.data2);

        Cat cat = new Cat("Billo Rani", 6);
        cat.breed = "Xy";
        cat.color = "Black";
        cat.setAge(7);
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Breed: " + cat.breed);
        System.out.println("Color: " + cat.color);

    }

}

class ParamConstructor {
    private int data1;
    public int data2;

    ParamConstructor(int d1, int d2) {
        this.data1 = d1;
        this.data2 = d2;

    }
}

class ConstructorExample {
    // *Non parametarized constructor */
    ConstructorExample() {
        System.out.println("I run in object creation");
        // * Add more logic */
        // * Only called once, to set attributes value in most cases */
    }
}

/*
 * Task
 * Make a class Cat
 * Make 2 private attribute name, age
 * Mkae 2 public attribute breed, color
 * Make a constructor to only set name and age
 * Make a getter for name and age
 * Make a setter for age
 * Make an Object of cat
 * Fill the attributes
 * Add +1 to the current age
 * Print the following using object
 * Name: Ny
 * Age: 4
 * Breed: Xy
 * Color: Orange
 */

class Cat {
    private String name;
    private int age;
    public String breed;
    public String color;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int age) {
        this.age = age;
    }

}
