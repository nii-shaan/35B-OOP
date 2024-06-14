package OOPs.Inheritance;

public class InheritanceClass {
    public static void main(String[] args) {

        ChildClass cc = new ChildClass();
        cc.firstname = "Xyz";
        cc.lastname = "ANC";
        cc.expenses = 100.11;
        // cc.salary = 10000;
        cc.info();
        cc.detail();

    }

}

class ParentClass {
    public String lastname;
    private int salary;
    protected double expenses;

    void info() {
        System.out.println("Parent Function" + lastname);

    }

}
/*
 * To use inheritance use the keyword "extends"
 * single level inheritance, one parent/super -one child/sub
 */

class ChildClass extends ParentClass {
    String firstname;

    void detail() {
        System.out.println(firstname + " " + lastname);
    }
}
// * Multi level inheritance, nested class, child class has another child class

class GrandChildClass extends ChildClass {
    String middlename;

    void description() {
        System.out.println(firstname + " " + middlename + " " + lastname);
    }
}

// * Tree/ heirarical inheritance
class BorhterClass extends ParentClass {
    String address;

    void living() {
        System.out.println(lastname + " " + address);
    }
}