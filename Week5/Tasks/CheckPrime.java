package Tasks;

import java.util.Scanner;

class CheckPrime {

    static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        /*
         * Make a method to check if a number is prime or not
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Prime or not: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num) ? num + " is prime number" : num + " is not prime number!");
        sc.close();

    }
}
