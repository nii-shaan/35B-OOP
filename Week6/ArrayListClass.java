import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {

        /* Import ArrayList from java.util at the top */
        /* Cannot use primitive data type, use wrapper for it */
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        /* To add on array list */
        arrayList1.add(10);
        arrayList1.add(20);
        System.out.println(arrayList1);
        /* Can also add at index directly */
        arrayList1.add(1, -20); // This will shift the currently element in 1th index to 2nd index

        System.out.println(arrayList1);

        /* To remove .remove(index) */
        arrayList1.remove(0); // will remove 0th index element and shift 1st to 0
        System.out.println(arrayList1);
        /* To up date .set(index,value) */
        arrayList1.set(0, -200);
        System.out.println(arrayList1);
        /* To access .get(index) */
        System.out.println("0th index element " + arrayList1.get(0));

    }

}