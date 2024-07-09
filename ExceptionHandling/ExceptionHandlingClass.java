package ExceptionHandling;

public class ExceptionHandlingClass {

    public static void main(String[] args) {

        System.out.println("Program Start");
        int num1 = 10;

        try {
            int num2 = num1 / 0; // * Arthemetic exception - exists here

        } catch (Exception e) {
            // * ex will have system generated msg
            System.out.println("cannot divide by zero");
        } finally {
            System.out.println("Fnally runs whether exception occurs or not");
        }

        // * Note: Catch and finally are optional, but, either or both should be present
        // * after try

        int[] numA = new int[5];
        numA[0] = 100;

        try {
            numA[100] = 1000; // * Array IndexOutOfBoundsException - exits heres
        } catch (Exception e) {
            System.out.println("Array is not long enough");
        }

        // * Any object can be assigned value of null
        String data = null;
        try {

            System.out.println(data.length()); // * Null pointer exception
        } catch (Exception e) {

            System.out.println("Null value");

        }

        // * Multi layered exception
        try {
            int numMulti = 1000 / 0;
            String d2 = null;
            System.out.println(d2.length());
        } catch (ArithmeticException ex) {
            System.out.println("Number error");
        } catch (NullPointerException ex) {
            System.out.println("Null ayo");
        } finally {
            System.out.println("Try end");
        }

        // * Exception

        try {
            int num3 = 10 / 0;
            int[] numArr2 = new int[100];
            numArr2[1000] = 10;

        } catch (Exception e) {
            System.out.println("I catched all exception");
        }

        /*
         * Note: if you dont know waht kind of exception your code throws
         * use exception
         * Throw manually throw exception
         */

        throwExample();

        System.out.println("Program end");
    }

    static void throwExample() {
        throw new ArithmeticException("I am throwing exception");
    }

    static void checkTry() throws Exception {
        System.out.println("When runing this function wrap around try catch");
    }

}
