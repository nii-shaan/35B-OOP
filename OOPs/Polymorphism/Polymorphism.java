package OOPs.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {

        MathOperation mo = new MathOperation();
        System.out.println(mo.add(10, 20));
        System.out.println(mo.add(10, 20, 30));
        mo.add();

    }
}

/*
 * Method overloading- compile time polymorphism
 * Making same function multiple times with diff in parameter
 */
class MathOperation {

    int add(int n1, int n2) {
        return n1 + n2;
    }

    // *1 Changing the number of paramter
    int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // *2 Changing the data type of parameter
    double add(double n1, double n2) {
        return n1 + n2;
    }

    /*
     * Note: Method overloading expects the unique in data type of parameter
     * Cannot overload method just by changing variable
     * EG: int add(int a,int b) => cannot do this as add wtih 2 int already made
     * Cannot overload by just changing data type
     * EG: double add(int num1,int num2) => cannot do this as add with int is
     * already made
     */
    void add() {
        System.out.println("Invalid operation!");
    }
}

/*
 * Method overriding - Runtime polymorphism
 * Making the same function of ParentClass in ChildClass
 */

class Document {
    public void print(String paper) {
        System.out.println(("Document printing"));
    }
}

// * Method overriding is only possible in ChildClass
class MsWord extends Document {
    boolean online = false;

    @Override
    public void print(String paper) {
        System.out.println("Ms word is printing");
    }
}

// * Method overriding can be done in multi level inheritance
class Office365 extends MsWord {
    boolean online = true;

    @Override
    public void print(String paper) {
        System.out.println("online is printing");
    }
}
