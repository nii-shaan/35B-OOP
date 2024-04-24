package Week2.Tasks;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        // Write a program to take two integer inputs from the user and print the sum
        // and product of them.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int firstNum = sc.nextInt();

        System.out.println("Enter Second number: ");
        int secondNum = sc.nextInt();
        System.out.println("Product is " + (firstNum + secondNum));
        sc.close();

    }

}
