import java.util.*;

public class ArrayListTask {
    public static void main(String[] args) {

        /*
         * Task
         * make ArrayLIst of following
         * ["Apple","Orange","Banana","Water Melon","Pineapple"]
         * Add "Grapes " in 1 index
         * Remove orange from the arrayList
         * remover Water Melon
         * Add Pear in 0th index
         * change "Pineapple" to "Avocado"
         * change "Apple to "Cherry
         * Note: Print on every add and remove to get the new index of ArrayList
         */

        // Arrays.asList("","") using this we can give values on initialization of
        // ArrayList
        ArrayList<String> fruits = new ArrayList<>(
                Arrays.asList("Apple", "Orange", "Banana", "Water Melon", "Pineapple"));
        System.out.println(fruits);

        fruits.add(1, "Grapes");
        System.out.println(fruits);

        fruits.remove("Orange");
        System.out.println(fruits);
        fruits.remove("Water Melon");

        fruits.add(0, "Pear");
        System.out.println(fruits);

        fruits.set(4, "Avocado");
        System.out.println(fruits);

        fruits.set(1, "Cherry");
        System.out.println(fruits);

    }

}
