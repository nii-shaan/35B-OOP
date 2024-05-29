package Tasks;


// import java.util.Scanner;

public class Task10 {

    static int[] push(int[] arr, int item) {

        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[temp.length - 1] = item;
        return temp;
    }

    // static int[]

    public static void main(String[] args) {

        // *Write a Java program to display all prime numbers less than a given number
        //* and count all the prime numbers less than that number using functions */

        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        // int range = sc.nextInt();


    }

}
