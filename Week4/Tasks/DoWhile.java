package Tasks;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int res = 0;
        boolean cont = true;

        do {
            System.out.println("Enter a Positive non-zero integer: ");
            int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {
                res += i;
            }
            System.out.println("Sum of 1 to " + num + " is " + res);

            System.out.println("Do you want to continue? Enter ‘y’ for yes or any other character for no.");
            char doAgain = sc.next().charAt(0);

            if (doAgain == 'y') {
                cont = true;
            } else {

                cont = false;
            }

        } while (cont == true);
        sc.close();

    }

}
