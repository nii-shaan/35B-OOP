package Tasks;

import java.util.Scanner;

public class Task8 {

    static void generateFibonacci(int n) {

        if (n > 0) {
            int n1 = 0;
            int n2 = 1;
            int n3;

            System.out.println(0);
            System.out.println(1);
            for (int i = 0; i < n - 2; i++) {

                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.println(n3);

            }
        }

    }

    public static void main(String[] args) {
        /*
         * Calculate the nth Fibonacci number using the method.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("How many fibonacci you want: ");
        int n = sc.nextInt();
        generateFibonacci(n);
        sc.close();

    }

}
