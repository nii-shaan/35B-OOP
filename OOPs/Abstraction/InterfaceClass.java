package OOPs.Abstraction;

public class InterfaceClass {
    public static void main(String[] args) {

    }
}

/*
 * interface is made as same as class replacing with "interface"
 * interface cannot be made object of
 */
interface AnimalDo {
    public void move();

    public boolean eat(String food);
    // * functions of interface is automatically public and abstract
}

// * interface can extend anotther interface
interface MammalDo extends AnimalDo {
    public int legs();
}

// * can be extended into multiple layer
interface DogDo extends MammalDo {
    public void bark();
}

interface DomesticAnimalDo {
    public void pet();
}

class Husky implements DogDo, DomesticAnimalDo {
    /*
     * When implementing multiple interface, all the function from implemented
     * interfaces
     * should be oeverriden
     */

    @Override
    public void pet() {
        System.out.println("Husky likes pet");
    }
    
    /*
     * when implementing interface that extends another interface
     * must override all the function made on top of it
     */
    @Override
    public void bark() {
        System.out.println("BOW WOW");
    }

    @Override
    public int legs() {
        return 4;
    }

    @Override
    public void move() {
        System.out.println("Husky move fast");
    }

    @Override
    public boolean eat(String food) {
        System.out.println("Husky eat fish");
        return false;
    }
}

/*
 * "implements" keyword to use interface
 */
class Wolf implements AnimalDo {
    // * When implementing interface, all the function should be overridden
    @Override
    public void move() {
        System.out.println("Wolf move fast");
    }

    @Override
    public boolean eat(String food) {
        System.out.println("Wolf eat meat");
        return false;
    }
}

class Cow implements AnimalDo {

    @Override
    public void move() {
        System.out.println("Cow moves fast");
    }

    @Override
    public boolean eat(String food) {
        System.out.println("");
        return true;

    }
}