package Tasks;

import java.util.Scanner;

public class AskUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Negetive number: ");
        int num = sc.nextInt();

        while (num > 0) {
            System.out.println("Number is not negative enter again: ");
            num = sc.nextInt();

        }
        if (num < 0) {
            System.out.println("Sucess! The given number was negative");
        }
        sc.close();

    }

}
