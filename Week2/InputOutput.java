package Week2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter Your name: ");
        String userInput  = scan.nextLine();
        System.out.println("Entered word is : "+userInput);
        



        //Use System.out.printf("hello %s",input ) basic format
        System.out.printf("Hello %s, Nice to meet you!",userInput);
        System.out.printf("multiple args\narg1: %s \narg2: %d \narg3: %b \narg4: %f","abc",18,true,99.5);



        System.out.println("\nThe following takes whole sentence");
        String wholeString = scan.nextLine();
        System.out.println("The input is "+ wholeString);



        System.out.println("\nThe follwing takes interger only ");
        int interg = scan.nextInt();
        System.out.println("\nThe enterd integer is :" + interg);

        System.out.println("\nthe following takes boolen: ");
        boolean bool = scan.nextBoolean();
        System.out.println("the entered bool value is: " + bool);

        scan.close();





    }
    
}
