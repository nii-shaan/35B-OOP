package Week3.Tasks;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        /* Task
         * Consider the following marking
         * calculate the total and avg in a variable 
         * if any of the marking is less than 35, print fail
         * if avg is less than 60, print third div
         * if avg in is less than 70, print second div
         * if avg is less than 80, print first div
         * if avg is equal or greater than 80, print distinction
         * if avg is less than 0 or more than 100, print invalid
         */

         Scanner sc = new Scanner(System.in);
         System.out.println("Marks in English");
         int english = sc.nextInt();
         System.out.println("Marks in Science");
         int science = sc.nextInt();
         System.out.println("Marks in Math");
         int math = sc.nextInt();


         // Total
         int total = english+science+math;
         System.out.println(total);

         // Average
         float average = (total/3);

         System.out.println(average);


         if(english<35||science<35||math<35){
            System.out.println("You've Failed");
         }
         else if(average<60){
            System.out.println("Third Division");
         }
         else if(average<70){
            System.out.println("Second Divsion");
         }
         else if(average<80){
            System.out.println("First Division");
         }
         else if(average>=80){
            System.out.println("Distinction");
            
         }
         else if(average<0||average>100){
            System.out.println("Invalid");
         }
         else{
            System.out.println("Error 404!");
         }
         sc.close();

        
    }
    
}
