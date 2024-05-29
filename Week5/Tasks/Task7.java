package Tasks;

import java.util.Scanner;

public class Task7 {
    public static int factorial(int num) {
        int res = num;
        for (int i = num - 1; i > 0; i--) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        /*
         * . Calculates the factorial of a given number using the Java method.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its factorial: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
        sc.close();

    }
}
