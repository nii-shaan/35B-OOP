public class MultiplicationTable {
    public static void main(String[] args) {

        // int multOf = 2;
        // for(int i =1;i<=10;i++){
        // System.out.println(multOf +" x " + i +" = " + i*multOf);
        // }

        for (int i = 10; i > 0; i--) {
            System.out.println("Multiplication of: " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);

            }
        }

    }

}
