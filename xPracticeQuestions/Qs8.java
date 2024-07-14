package xPracticeQuestions;

import java.util.Scanner;

/*
 * Design and implement a simple Java application that prompts the user to enter valid email address.
 * Your application should throw and handle a custom exception if the user enters an invalid email address.
 * - InvalidEmailException:
 * - A custom exception that is thrown when the user enters an email address that does not match a valid email pattern
 * (e.g., it should contain '@' and '.' characters).
 */

public class Qs8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email address: ");
        String emailAddress = sc.nextLine().trim();
        sc.close();

        try {
            if (!emailAddress.contains("@") || !emailAddress.contains(".") || emailAddress.length() < 5) {
                throw new InvalidEmailException("Invalid email address");
            }
            System.out.println("The Email address is valid: " + emailAddress);

        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidEmailException extends Error {

    InvalidEmailException(String s) {
        super(s);
    }
}
