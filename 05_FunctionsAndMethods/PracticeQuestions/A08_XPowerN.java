package PracticeQuestions;

import java.util.Scanner;

public class A08_XPowerN {
    public static long power (int x , int n ){
        int result = 1;
        while(n>0){
            result = result * x;
            n--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.println("X to th power n is : "+ power(x,n));
    }
}
