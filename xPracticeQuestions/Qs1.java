package xPracticeQuestions;

public class Qs1 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Nishan", 3.90);
        s1.printProfile();

    }
}

/*
 * Create a Student class to simulate a student's profile. The class should have
 * the following attributes: student ID ,name and GPA, Include methods to
 * updateGPA() and printProfile(), Implement functionality to create new student
 * profiles, update GPAs, and print student profiles
 */

class Student {
    int studentId;
    String name;
    double GPA;

    Student(int studentId, String name, double GPA) {
        this.studentId = studentId;
        this.name = name;
        this.GPA = GPA;
    }

    public void updateGPA(double newGpa) {
        this.GPA = newGpa;

    }

    public void printProfile() {
        System.out.println("{ Name: " + this.name + ", StudentId: " + this.studentId + ", GPA:" + this.GPA + " }");

    }

}
