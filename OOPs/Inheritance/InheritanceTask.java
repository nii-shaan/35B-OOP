package OOPs.Inheritance;

public class InheritanceTask {
    public static void main(String[] args) {

    }
}

/*
 * Make a class Pant
 * Add two attribute color and texture
 * Make constructor or Pant that takes color and texture
 * Make a class HalfPant that extends Pant
 * Make a attribute color and add default String White
 * Make a non param constructor of HalfPant and
 * call the Parameterized constructor of parent pant with "Black" and "Wool"
 * Make a function design() in HalfPant that takes String color
 * Change the parent color to current color of halfpant
 * change the current color of half pant to provied parameter
 */

class Pant {
    String color;
    String texture;

    Pant(String color, String texture) {

        this.color = color;
        this.texture = texture;
    }
}

class HalfPant extends Pant {

    String color = "White";

    HalfPant() {
        super("Black", "Wool");
    }

    public void design(String color) {
        super.color = this.color;
        this.color = color;
    }

}