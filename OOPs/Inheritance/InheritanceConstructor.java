package OOPs.Inheritance;

public class InheritanceConstructor {
    public static void main(String[] args) {

        Polo p1 = new Polo();
        p1.differentColor("Yellow");

        Polo p2 = new Polo("Yellow");
        Polo p3 = new Polo(10);

    }
}

class Shirt {
    String color = "Black";

    Shirt() {
        System.out.println("Making Shirt");
    }
}

class Polo extends Shirt {
    String color = "White";
    String texture;

    Polo() {
        /*
         * By default the constructor of parent class is called
         * meaning super() or Shirt() on first line of execution
         */
        System.out.println("Making Polo Shirt");
    }

    // * Constructor Overloading
    // * Same name function/construtor wiht different logic/param
    Polo(String color) {
        this.color = color;
        System.out.println("Constructor with one string");
    }

    Polo(String Color, String texture) {
        this.color = color;
        this.texture = texture;
        System.out.println("Constructor with two string");
    }

    Polo(int num) {
        System.out.println(num);
        System.out.println("Constructor with one int");
    }

    void differentColor(String color) {
        System.out.println("Param color: " + color);
        System.out.println("Class Color: " + this.color);
        System.out.println("Parent Color: " + super.color);
    }
}
