package Tasks;

import java.util.Scanner;

public class Task9 {

    public static int getGCD(int num1, int num2) {

        int res = 0;
        for (int i = 1; i < num1 || i < num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                res = i;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        // * Write a Java program to find the greatest common divisor (GCD) of two
        // numbers.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int numOne = sc.nextInt();
        System.out.println("Enter second number: ");
        int numTwo = sc.nextInt();
        System.out.println("GCD: " + getGCD(numOne, numTwo));
        sc.close();

    }

}
