package Week2;

public class Operatorclass {
    public static void main(String[] args) {

        /* Arithemetic Operators */

        int aNum1 = 10;
        int aNum2 = 20;
        System.out.println("the sum is: " + " " + (aNum1 + aNum2));
        System.out.println("Subtraction is: " + " " + (aNum1 - aNum2));
        System.out.println("Multiplication is: " + " " + (aNum1 * aNum2));
        System.out.println("Division is " + " " + (aNum1/aNum2));
        System.out.println("Modulo is :"+" "+(aNum1%aNum2));



        /* Assignment Operators */
        int asNum = 20;
        System.out.println("+=10 is " + (asNum+=10));
        System.out.println("-=10 is "+ (asNum-=10));
        System.out.println("*=10 is " + (asNum*=10));
        System.out.println("/=10 is " + (asNum/=10));
        System.out.println("%=2 is " + (asNum%=2));
    

    /*
        
        Relational Operators


    */  


    /*
        Logial Operators


    */

    /* Unary Operator  */
    int uNum1 = 10;

    uNum1++; // changes value in next line
    ++uNum1; // changes value in same line
    System.out.println(uNum1);
    


    }
}
