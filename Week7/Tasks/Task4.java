package Week7.Tasks;

public class Task4 {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", "P.A", "CEO's P.A", 2000000);
        e1.upadateSalary(300000);
        e1.calculateSalary();

    }
}
/*
 * 4. Write a Java program to create a class called "Employee" with a name, job
 * title, and salary attributes, and methods to calculate and update salary.
 */

class Employee {
    String name;
    String job;
    String title;
    double salary;

    Employee(String name, String job, String title, double salary) {
        this.name = name;
        this.job = job;
        this.title = title;
        this.salary = salary;
    }

    void upadateSalary(double newSalary) {
        this.salary = newSalary;
    }

    void calculateSalary() {
        if (salary > 0) {
            System.out.println(this.name + " Annual salary is: " + this.salary * 12);
        } else {
            System.out.println("Invalid Salary");
        }

    }
}