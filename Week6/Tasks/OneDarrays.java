
public class OneDarrays {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        MyArray nArrs = new MyArray(arr);
        System.out.println(nArrs.contains(0));
        nArrs.average();
        nArrs.printMinMax();

    }

}

class MyArray {

    private int[] push(int[] arr, int itemToPush) {
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[temp.length - 1] = itemToPush;
        return temp;
    }

    private int[] arr = {};

    MyArray(int[] arr) {
        this.arr = arr;
    }

    // *1. Write a Java program to calculate the average value of array element.
    public void average() {
        double sum = 0;
        for (int i = 0; i < this.arr.length; i++) {
            sum += this.arr[i];
        }
        System.out.println("Average: " + sum / this.arr.length);

    }

    // *2. Write a Java program to test if an array contains a specific value.
    public boolean contains(int value) {
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    // *3. Write a Java program to find the maximum and minimum value of an array.
    public void printMinMax() {

        if (this.arr.length == 0) {
            System.out.println("Array cannot be empty");
        } else {

            int min = this.arr[0];
            int max = this.arr[0];

            for (int i = 0; i < this.arr.length; i++) {
                if (min > this.arr[i]) {
                    min = this.arr[i];
                }

                if (max < this.arr[i]) {
                    max = this.arr[i];
                }

            }
            System.out.println("Minimum: " + min);
            System.out.println("Maxmum: " + max);
        }

    }

    // *4. Write a Java program to reverse the element of a one-dimensional array.
    public int[] reverse() {
        int[] reversedArr = {};
        for (int i = this.arr.length; i >= 0; i--) {
            reversedArr = push(reversedArr, i);
        }
        return reversedArr;
    }

}
