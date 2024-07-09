package Week8.Tasks;

public class Task3 {
    public static void main(String[] args) {

        /*
         * 3. You are working on a student information system and need to create a
         * Student class. The student class should have private instance variables for
         * the student's name, ID number, and grade point average (GPA). Implement
         * getter and setter methods for the name and ID number, ensuring that they can
         * be accessed and modified only through these methods. However, the GPA should
         * be read-only and can only be set within the class constructor.
         */

        Student s1 = new Student(3.85);
        s1.setId(101);
        s1.setName("John");
        System.out.println("Student name: " + s1.getName() + "\n Id: " + s1.getId() + "\n GPA: " + s1.getGpa());

    }

}

class Student {
    private String name;
    private int id;
    private double gpa;

    Student(double gpa) {
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

}
