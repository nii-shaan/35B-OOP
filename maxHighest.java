import java.util.Scanner;

public class maxHighest {

    static int max(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < 5; i++) {
            if (temp <= arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }

    static int indexOfHighest(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < 5; i++) {
            if (temp <= arr[i]) {
                temp = arr[i];
            }
        }
        for (int j = 0; j < 5; j++) {
            if (arr[j] == temp) {
                return j;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] myArr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i + 1) + " number: ");

            myArr[i] = sc.nextInt();
        }
        System.out.println("Max value is: " + max(myArr));
        System.out.println("Index of highest: " + indexOfHighest(myArr));
        sc.close();
    }

}