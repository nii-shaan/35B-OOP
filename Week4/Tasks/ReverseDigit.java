package Tasks;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers eg:12345 : ");
        String number = sc.nextLine();
        String newNum = "";

        for (int i = number.length() - 1; i >= 0; i--) {
            newNum += number.charAt(i);

        }
        System.out.println(newNum);

        sc.close();
    }

}
