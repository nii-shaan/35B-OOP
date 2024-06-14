package Tasks;

import java.util.Scanner;

public class Even {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        /*
         * Make a method to check if a given number n is even or not.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check Even or not: ");
        int n = sc.nextInt();
        System.out.println(isEven(n) ? n + " is Even number!" : n + " is not Even number!");
        sc.close();
    }

}
