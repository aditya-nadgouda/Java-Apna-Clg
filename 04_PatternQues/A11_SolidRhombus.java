import java.util.Scanner;

//                        * * * * *
//                      * * * * *
//                    * * * * *
//                  * * * * *
//                * * * * *

public class A11_SolidRhombus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n*2-1; j++) {
                if (i + j >= n + 1 && i + j <= n * 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
