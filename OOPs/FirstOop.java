package OOPs;

public class FirstOop {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name="Nishan";
        p1.age=20;
        p1.gender='M';
        p1.introduction();


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

class Square{
    int sides;
    int area(){
        int area = sides*sides;
        return area;

    };

    void addSides(int val){
        sides=sides+val;
    }
}