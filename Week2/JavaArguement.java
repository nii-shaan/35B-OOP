package Week2;

public class JavaArguement {
    public static void main(String[] args) {

        if(args.length<2){
            System.out.println("Not enough arguements");
            return;
        }
        System.out.println("The first args is " + args[0]);
        System.out.println("The second args is " + args[1]);


        int noramValue = 10;
        int parseInt = Integer.parseInt(args[1]);
        /*Not that the second argument must be a number */
        int sum = noramValue+parseInt;
        System.out.println(sum);




    }
    
}
