import java.util.Scanner;

// 1. Write a program to find if a number is a power of 2 or not.

public class A05_NumPowerOfTwoOrNot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num to check : ");
        int num = in.nextInt();
        boolean isPowerOf2 = false;

        // Loop Method

//        int mul = 1;
//        while (mul < num){
//            mul *=2;
//            if (mul==num){
//                isPowerOf2 = true;
//                break;
//            }
//        }
//
//        if (isPowerOf2){
//            System.out.println("The entered number is a power of 2");
//        }else {
//            System.out.println("Not a power of 2");
//        }

        // Mathematical method

//        int div = num;
//        while (div%2==0){
//           div /=2;
//           if (div==1){
//               isPowerOf2 = true;
//           }
//        }
//        if (isPowerOf2){
//            System.out.println("The entered number is a power of 2");
//        }else {
//            System.out.println("Not a power of 2");
//        }

        // Bit manipulation method

        int result = num & (num-1);
        if (result==0){
            System.out.println("The entered number is a power of 2");
        }else {
            System.out.println("Not a power of 2");
        }
    }
}
