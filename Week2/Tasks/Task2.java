package Week2.Tasks;

public class Task2 {
    public static void main(String[] args) {
        /*
            Writie a program to print simple interest from variables
        */
        int amount = 50000;
        int time =  2;
        int rate = 5 ;
        double si = (amount*time*rate)/100;
        System.out.println("The Simple interest is: "+ si);
    }
    
}
