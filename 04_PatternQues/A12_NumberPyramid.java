import java.util.Scanner;

public class A12_NumberPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <= n*2-1; j++) {
//                if (i+j>=n+1 && j-i<=n-1){
//                    System.out.print(i+" ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <= n*2-1; j++) {
//                if (i+j>=n+1 && j-i<=n-1){
//                    if ((i+j)%2!=0){
//                        System.out.print("  ");
//                    }
//                    else {
//                        System.out.print(i+" ");
//
//                    }
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }



//        for (int i = 1; i <=n; i++) {
//
//            //Spaces
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("  ");
//            }
//
//            //Number
//            for (int j = 1; j <= (i*2-1); j++) {
//                if (j%2==0){
//                        System.out.print("  ");
//                    }
//                    else {
//                        System.out.print(i+" ");
//
//                    }
//            }
//            System.out.println();
//
//        }

        for (int i = 1; i <=n; i++) {

            //Spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //Number
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");

            }
            System.out.println();

        }



    }
   

}
