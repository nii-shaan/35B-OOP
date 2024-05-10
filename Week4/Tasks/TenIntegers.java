package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class TenIntegers {

    static int[] push(int[] passedArr, int numToPush) {
        int n = passedArr.length + 1;

        int[] newArr = new int[n];
        for (int i = 0; i < passedArr.length; i++) {
            newArr[i] = passedArr[i];
        }
        newArr[n - 1] = numToPush;
        return newArr;
    }

    public static void main(String[] args) {
        int[] nums = {};

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + i + ":");
            int j = sc.nextInt();
            nums = push(nums, j);
        }
        sc.close();
        int[] arrForMore = {};
        int[] arrForLess = {};

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 50) {

                arrForMore = push(arrForMore, nums[i]);
            } else if (nums[i] <= 50) {

                arrForLess = push(arrForLess, nums[i]);
            }

        }

        int totalOfMore = 0;
        int totalOfLess = 0;
        for (int i = 0; i < arrForMore.length; i++) {
            totalOfMore += arrForMore[i];
            // System.out.print("numbers bigger than 50: " + i);
        }

        for (int i = 0; i < arrForLess.length; i++) {
            totalOfLess += arrForLess[i];
            // System.out.print("These are less or equal to 50: " + i);
        }

        System.out.println("Average of more than 50: " + (totalOfMore / (arrForMore.length)));
        System.out.println("Average of less or equal to 50: " + (totalOfLess / (arrForLess.length)));

    }

}
