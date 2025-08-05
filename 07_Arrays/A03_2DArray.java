import java.util.Scanner;

public class A03_2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();

        int [][] intMatrix= new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                intMatrix[i][j]= in.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(intMatrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
