
public class TasksAll {

    static int arrayFinder(String arr[], String item) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == item) {
                return i;
            }
            i += 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // String myArr[] = { "Cat", "Dog", "Tiger", "Snake" };
        // System.out.println(myArr[myArr.length - 1]);

        /*
         * Make an arrao of ["John","Doe","Foo","Bar"]
         * Make a String "Foo"
         * Loop teh array and find in which index is "Foo" on
         * Print the index
         */

        // String itemTofind = "Foo";
        // String items[] = { "John", "Doe", "Foo", "Bar" };

        // int i = 0;
        // while (i < items.length) {
        // if (items[i] == itemTofind) {
        // System.out.println("The item is at index: " + i);
        // break;
        // }

        // i += 1;
        // }

        /*
         * Make the function for the above name arrayFinder
         * Takes array of String and String as parameter
         * return index if 2nd arguement values matches any element of array
         * else return -1
         * print the reutnred index value
         */
        

        String myArr[] = { "John", "Doe", "Foo", "Bar" };
        int res = arrayFinder(myArr, "Foo");
        System.out.println(res);

    }
}
