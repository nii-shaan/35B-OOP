public class PrefixPostfix {
    public static void main(String[] args) {

        int prefixValue = 10;
        System.out.println("Prefic will update here: "+ ++prefixValue);
        System.out.println("It will remail the same: "+ prefixValue);
        /*Prefix is when you put operator in the left side of value /var */


        int postFixValue = 20;
        System.out.println("Postfix will not update here: "+ postFixValue++);
        System.out.println("It will update here " + postFixValue);
        /*Postfix is when you put operator in the right side of vlaue /var */

        


    }
}
