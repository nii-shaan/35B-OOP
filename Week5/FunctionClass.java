
public class FunctionClass {

    /*
     * Function ar made inside class scope
     * above or below main not inside
     */

    void PrintSomething() {
        System.out.println("This Function prints");

    }

    int returnInt() {
        int value = 10;
        return value;
    }

    double addValue(int num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    boolean isEqual(double num1, double num2) {

        return num1 == num2;
    }

    public static void main(String[] args) {
        /*
         * To call a normal/non static function we need to craete object
         * just remember the syntax for now
         */

        FunctionClass fc = new FunctionClass();
        // call function from object/ variable of FunctionClass

        fc.PrintSomething();
        int returnFromFunction = fc.returnInt();
        System.out.println(returnFromFunction);
        
        /*
         * with return type
         */

        double returnFromAdd = fc.addValue(20, 5.0);
        System.out.println("Return from double: " + returnFromAdd);

        boolean returnFromEqual = fc.isEqual(5.0, 5.0);

        System.out.println(returnFromEqual ? "It is equal" : "It is not equal");

    }
}