import java.util.Scanner;
//                  *
//                 * *
//               * * *
//             * * * *


public class A05_InvertedHalfPyramid02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if(i+j>=n+1){
//                    System.out.print("*"+" ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        // 2.

        for (int i = 1 ; i <= n ; i++ ){
            // inner loop : For spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }

            // inner Loop : For *

            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
