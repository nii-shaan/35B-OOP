import java.util.Scanner;

public class StaticFunction {

    // Taught
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Taught
    public static String vendingMachine(int menu) {

        return menu == 1 ? "Coke" : menu == 2 ? "Water" : menu == 3 ? "Frooti" : "Invalid item number";
    }

    // Task 1
    public static String checkEligible(String name, int age) {

        return age < 0 && age > 200 ? "Hello " + name + " Invalid Age"
                : age < 18 ? "Sorry " + name + " You are not eligible " : "Congratulation " + name + " You're eligible";
    }

    // Task 2
    public static double makeSquare(double num) {
        return Math.pow(num, 2);
    }

    public static void main(String[] args) {
        /*
         * if the function is static and in same class
         * no need to make object simply call it.
         */

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first num: ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter second num: ");
        // int num2 = sc.nextInt();
        // System.out.println("Multiplication is: " + multiply(num1, num2));

        // Taught
        System.out.println("Enter menu");
        int itemNum = sc.nextInt();
        System.out.println("You get: " + vendingMachine(itemNum));

        // Task 2
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter age to check");
        int age = sc.nextInt();
        System.out.println(checkEligible(name, age));

        // Task 2
        System.out.println("Enter a number to get its Square: ");
        double numToSquare = sc.nextDouble();
        System.out.println(makeSquare(numToSquare));
        sc.close();

    }

}
