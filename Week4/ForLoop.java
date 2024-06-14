public class ForLoop {

    public static void main(String[] args) {
        /*
         * For loop takes initialization
         * conditon
         * modify.update
         */
        for(int i =0;i<=5;i++){
            System.out.println("For i " + i);
        }
        /*can use different update logic like
         * for(int index=0; index<=5; index+=3)
         */

         /*Using decrement */
         for(int i = 10;i>=0;i--){  
            System.out.println("For i Decrement " + i);
         }
    }   
}
