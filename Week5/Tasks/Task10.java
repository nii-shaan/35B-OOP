package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

    static int[] push(int[] arr, int item) {

        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[temp.length - 1] = item;
        return temp;
    }

    static boolean isPrime(int n) {

        if (n < 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    static void generatePrimeNumber(int range) {
        if (range < 0) {
            System.out.println("Invalid Range!");
        } else {

            int[] res = {};
            for (int i = 2; i <= range; i++) {
                if (isPrime(i)) {
                    res = push(res, i);

                }
            }
            System.out.println(Arrays.toString(res));
            System.out.println("Total prime numbers: " + res.length);
        }
    }

    public static void main(String[] args) {

        // *Write a Java program to display all prime numbers less than a given number
        // * and count all the prime numbers less than that number using function */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int range = sc.nextInt();
        generatePrimeNumber(range);
        sc.close();

    }

}
