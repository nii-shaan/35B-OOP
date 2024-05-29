package Tasks;

import java.util.Scanner;

public class Table {
    public static void printTable(int n) {
        System.out.println("Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

    }

    public static void main(String[] args) {
        /*
         * Make a method to print the table of a given number n.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its table: ");
        int n = sc.nextInt();
        printTable(n);
        sc.close();

    }

}
