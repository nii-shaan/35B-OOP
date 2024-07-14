package xPracticeQuestions;

import java.util.Scanner;

/*
 * Design and implement a simple Java program that prompts the user to enter a string
 * within a specified length, for example between 5 and 20 characters. Your application
 * should throw and handle a custom exception if the user enters a string outside this length.
 * 
 * - InvalidStringLengthException
 * - A custom exception that is thrown when the user enters a string with a length outside the valid range(5 to 20 characters)
 */

public class Qs7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minimum String length: ");
        int minLength = sc.nextInt();
        System.out.println("Enter maximum String length: ");
        int maxLength = sc.nextInt();
        sc.nextLine(); // * Scanner.nextInt() only consumes integer not the whole line so to consume
                       // * whole line have to use this...

        System.out.println("Enter String: ");
        String enteredString = sc.nextLine();

        sc.close();
        try {
            if (enteredString.length() < minLength || enteredString.length() > maxLength) {
                throw new InvalidStringLengthException("Invalid String Length " + enteredString.length());
            }
            System.out.println("The entered String satisfies given conditions: " + enteredString);

        } catch (InvalidStringLengthException e) {
            System.out.println(e.getMessage());
        }

    }

}

class InvalidStringLengthException extends Error {

    InvalidStringLengthException(String s) {
        super(s);
    }

}