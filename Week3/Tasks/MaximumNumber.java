package Week3.Tasks;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = sc.nextInt();

        System.out.println("Enter third number: ");
        int thirdNumber = sc.nextInt();

        if(firstNum>secondNum && firstNum>thirdNumber){
            System.out.println(firstNum+" is the biggest");
        }else if(secondNum>firstNum&&secondNum>thirdNumber){
            System.out.println(secondNum+" is the greatest");
        }
        else{
            System.out.println(thirdNumber+" is the greatest");
        }
        sc.close();

    }
    
}
