public class ArrayClass {
    public static void main(String[] args) {
        /*
         * Array Declaration
         */
        // int[] myFirstArray;

        /*
         * Memory Allocation
         */

        int[] mySecondArray = new int[5];

        /*
         * Array declaration , memeory allocataion and initialization
         */
        int[] myThirdArray = { 10, 20, 30, 40 };

        // Array index => Position of element / values
        // Starts with zero

        mySecondArray[0] = 10;
        myThirdArray[1] = 20;
        mySecondArray[2] = 100;

        // Acess / Store in new variable 
        int arrayElement = mySecondArray[0];
        System.out.println("First index " + arrayElement);
        System.out.println("Second index " + mySecondArray[2]);
    

    }
}