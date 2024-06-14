package Week3.Tasks;
import java.util.Scanner;

public class SwtichTask {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get Day: ");
        int val = sc.nextInt();
        

        switch (val) {
            case 1:
            System.out.println("Sunday");    
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");

            default:
            System.out.println("Invalid Day!");
            break;
        }
        sc.close();




    }
    
}
