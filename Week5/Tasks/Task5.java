package Tasks;

import java.util.Scanner;

public class Task5 {

    public static void simpleInterest(int princi, float time, float rate) {
        float si = (princi * time * rate) / 100;
        System.out.println("The Simple Interest is : " + si);

    }

    public static void main(String[] args) {

        /*
         * Write a program for calculating Simple Interest using a method and print the
         * result from the method itself.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal: ");
        int princ = sc.nextInt();
        System.out.println("Enter Time: ");
        float time = sc.nextFloat();
        System.out.println("Enter Rate: ");
        float rate = sc.nextFloat();
        simpleInterest(princ, time, rate);
        sc.close();

    }

}
