package Week7.Tasks;

public class Task3 {

    public static void main(String[] args) {

        /*
         * Write a Java program to create a class called "Dog" with a name and breed
         * attribute. Create two instances of the "Dog" class, set their attributes
         * using the constructor and modify the attributes using the setter methods and
         * print the updated values.
         */

        Dog d1 = new Dog("Tommy", "Labrador");
        d1.setBreed("German Shepherd");
        d1.setName("Tommy");
        Dog d2 = new Dog("Spike", "Pitbull");
        d2.setBreed("Pitbull");
        d2.setName("Spike");

        System.out.println("Dog 1: Name: " + d1.getName() + " Breed: " + d1.getBreed());
        System.out.println("Dog 2: Name: " + d2.getName() + " Breed: " + d2.getBreed());

    }

}

class Dog {
    private String name;
    private String breed;

    Dog(String name, String breed) {

        this.name = name;
        this.breed = breed;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }
}