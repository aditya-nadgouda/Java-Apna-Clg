package PracticeQuestions;

import java.util.Scanner;

public class A02_SumOfAllOddNumZeroTillNnm {
    public static long sumOfOddNum(int num ){
        int sum =0;
        int i = 1;
        while (i<=num){
            sum +=i;
            i+=2;
        }
//        while(num!=0){
//            if (num%2!=0){
//                sum+=num;
//            }
//            num--;
//        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num :");
        int num = in.nextInt();
        if (num<0){
            num = num*(-1);
            System.out.println("Sum of all odd numbers from 0 to N : "+ (-1)*sumOfOddNum(num));

        }
        else {
            System.out.println("Sum of all odd numbers from 0 to N : "+ sumOfOddNum(num));
        }

    }
}
