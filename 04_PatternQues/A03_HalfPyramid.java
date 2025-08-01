
//        *
//        * *
//        * * *
//        * * * *

import java.util.Scanner;

public class A03_HalfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //1
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (j<=i){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //2

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
