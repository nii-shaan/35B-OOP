package Week7.Tasks;

public class Task2 {
    public static void main(String[] args) {

        SimpleInterest s1 = new SimpleInterest();
        s1.setPrinciple(2000);
        s1.setRate(10.5);
        s1.setTime(2);

        System.out.println("Principle: " + s1.getPrinciple());
        System.out.println("Rate: " + s1.getRate());
        System.out.println("Time: " + s1.getTime());

    }
}

/*
 * 2. Write a Java program to create a class called “Simple Interest” with a
 * data fields principle, time and rate, using setter getter method and print
 * the values.
 */

class SimpleInterest {
    private double principle;
    private double time;
    private double rate;

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public double getPrinciple() {
        return principle;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}