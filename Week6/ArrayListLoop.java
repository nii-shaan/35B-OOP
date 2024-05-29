import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {

        ArrayList<Integer> intArr = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        /* To loop ArrayList, same as array, get length/size first */
        /* To get length use .size() */
        int arrLen = intArr.size();
        for (int i = 0; i < arrLen; i++) {
            System.out.println("Index " + i + " Element " + intArr.get(i));
        }
        // Using for each
        for (Integer element : intArr) {
            System.out.println(element);
        }
    }

}
