package Tasks;

import java.util.Scanner;

public class Task4 {

    public static int mult(int numOne, int numTwo, int numThree) {

        return numOne * numTwo * numThree;

    }

    public static void main(String[] args) {
        /*
         * Write a program for multiplying 3 numbers using a method and return the
         * result and print the result from the main method.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int numOne = sc.nextInt();
        System.out.println("Enter Second number: ");
        int numTwo = sc.nextInt();
        System.out.println("Enter third number: ");
        int numThree = sc.nextInt();

        int multOfThree = mult(numOne, numTwo, numThree);
        System.out.println("The multiplication of them are: " + multOfThree);
        sc.close();

    }

}
