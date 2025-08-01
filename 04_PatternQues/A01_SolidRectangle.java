//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *

import java.util.Scanner;


public class A01_SolidRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // n == 4;
        for (int i = 0 ; i <n;i++ ){
            for (int j = 0 ; j <= n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

