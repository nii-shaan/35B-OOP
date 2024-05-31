package OOPs;

public class AccessModifier {

    public static void main(String[] args) {

        // AccessExample ae = new AccessExample();
        // ae.name = "ram";
        // ae.age = 12;
        // // ae.salary=1000.21; //
        // ae.defaultFunction();
        // ae.publicFunction();
        // // ae.privateFunction();//
        // ae.setSalary(100000);
        // System.out.println(ae.getSalary());

        Dog dog = new Dog();
        dog.setName("Max");
        dog.setAge(5);
        dog.breed = "Local";

        System.out.println("Name: " + dog.getName());
        System.out.println("Breed: " + dog.breed);
        System.out.println("Age: " + dog.getAge());
    }

}

class AccessExample {
    String name; // *Automatically default package/folder can acess */
    public int age; // *Can be accessed from anywhere */
    private double salary; // *Can only be accessed inside this class */

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    // *Same concept in function

    void defaultFunction() {
        System.out.println("I can be accessed inside a package");
    };

    public void publicFunction() {
        System.out.println("I can be accessed from anywhere");
    };

    private void privateFunction() {
        System.out.println("I can only be accessed inside class");
    };

    void accessPrivate() {
        System.out.println(salary);
        privateFunction();
    };

};

/*
 * Task
 * Make a class Dog
 * Make a private attribute name and age
 * Make a public attribute breed
 * Make a setter for name and age
 * Make a getter for name and age
 * Make an Object for dog
 * fill all attribute
 * Print the following using object
 * Name: xyz
 * Breed: Abc
 * Age: 10
 */

class Dog {
    private String name;
    private int age;
    public String breed;

    public void setName(String name) {
        this.name = name;
    };

    public void setAge(int age) {
        this.age = age;
    };

    public String getName() {
        return name;
    };

    public int getAge() {
        return age;
    };

}
