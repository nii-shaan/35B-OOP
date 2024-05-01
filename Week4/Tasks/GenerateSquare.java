package Tasks;

public class GenerateSquare {
    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            System.out.println("Number" + "     " + "Square");
            System.out.println(i + "      " + Math.pow(i, 2));
        }
    }

}
