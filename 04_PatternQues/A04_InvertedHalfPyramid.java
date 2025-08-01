import java.util.Scanner;

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *



public class A04_InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i+j<=n+1){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


//        2./

        for (int i = n; i > 0; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
}
