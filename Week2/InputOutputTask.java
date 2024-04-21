package Week2;

import java.util.Scanner;

public class InputOutputTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scan.nextLine();

        System.out.println("Are you over 18? true/false");
        boolean age = scan.nextBoolean();
        String ageOutput = age?"You are over 18":"You are not adult";

        System.out.println("How many siblings? ");
        int siblings = scan.nextInt();

      



        System.out.printf("Hello, %s\n%s \nNumber of siblings: %d",name,ageOutput,siblings);
        scan.close();




    }
    
}
