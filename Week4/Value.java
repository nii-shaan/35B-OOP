public class Value {
    public static void main(String[] args) {

        int endRange = 100;

        for (int i = 1; i <= endRange; i++) {
            if (i > 80)
                break;
            if (i % 8 == 0) {
                System.out.println(i);
            }
        }

    }

}
