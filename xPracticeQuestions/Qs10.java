package xPracticeQuestions;
/*
 * Write a program that prompts the user to enter a sentence and reads it into a string. The program should consist of the following methods:
 * - a method named "countVowels" that reads a String and returns the number of vowels in the String
 * - a method named "countConsonants" that reads a String and returns the number of consonants in the String
 * Invoke the above methods and demonstrate them in program
 */

import java.util.Scanner;

public class Qs10 {

    static boolean isVowel(char letter) {
        if (letter == 'a' || letter == 'e' || letter == 'i'
                || letter == 'o' || letter == 'u') {
            return true;
        }
        return false;

    }

    static int countVowels(String sentence) {
        int vowelCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (isVowel(sentence.charAt(i))) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    static int countConsonants(String sentence) {
        int consonantCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (!isVowel(sentence.charAt(i))) {
                consonantCount++;
            }
        }

        return consonantCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = sc.nextLine();
        sc.close();
        System.out.println("Number of vowels: " + countVowels(sentence));
        System.out.println("Number of consonants: " + countConsonants(sentence));

    }

}
