import java.util.*;

public class TaskClassWork {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>(
                Arrays.asList("Aruna", "Shreeya", "Yudip", "Anjali", "Nishchay", "Krishna"));

        ArrayList<String> males = new ArrayList<>();
        ArrayList<String> females = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) == "Aruna" || students.get(i) == "Shreeya" || students.get(i) == "Anjali") {
                females.add(students.get(i));
                if (students.get(i) == "Anjali") {
                    System.out.println(students.get(i));
                }
            } else {
                males.add(students.get(i));
                if (students.get(i) == "Yudip") {
                    System.out.println(students.get(i));
                }
            } 
        }

        System.out.println("Students: " + students);
        System.out.println("Males: " + males);
        System.out.println("Females: " + females);

    }

}
