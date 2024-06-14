


public class Main {
    public static void main(String[] args) {

        Bicycle sportsBicycle = new Bicycle();

        System.out.println(sportsBicycle.gear);

    }
}


class Bicycle {
    
    public int gear = 5;

    public void breaking() {
        System.out.println("Break is working");
    }

}