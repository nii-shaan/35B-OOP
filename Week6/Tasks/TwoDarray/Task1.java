package TwoDarray;

public class Task1 {
    public static void main(String[] args) {

        int[][] matrixOne = { { 1, 2, 3 }, { 1, 2, 3 } };
        int[][] matrixTwo = { { 1, 2, 3 }, { 1, 2, 3 } };
        
        int[][] additionResult = new int[2][3];

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {

                System.out.println(matrixOne[row][column]+matrixTwo[row][column]);
                

                



            }
        }

    }

}
