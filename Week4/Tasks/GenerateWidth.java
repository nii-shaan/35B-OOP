package Tasks;

import java.util.Scanner;

public class GenerateWidth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = sc.nextInt();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
