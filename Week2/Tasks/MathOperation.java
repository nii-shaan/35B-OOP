package Week2.Tasks;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int numOne = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int numTwo = sc.nextInt();

        System.out.println("Additon is: " + (numOne + numTwo));

        System.out.println("Multiplication is: " + (numOne * numTwo));

        System.out.println("Division is :" + (numOne / numTwo));
        sc.close();
    }

}
