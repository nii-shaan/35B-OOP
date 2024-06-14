package Tasks;

import java.util.Scanner;

public class Task6 {
    public static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }
    public static void main(String[] args) {
        /*
         * Write a program to calculate the area of a rectangle using a method of your
         * choice.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter Breadth: ");
        double breadth = sc.nextDouble();

        System.out.println("Area of given rectangle is: " + areaOfRectangle(length, breadth));
        sc.close();

    }

}
