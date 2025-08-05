package PracticeQuestions;

import java.util.Scanner;

public class A10_FibonacciSeries {

    public static int fibonacciSum(int n ){
        if (n == 1){
            return 0;
        }
        else if (n <= 3){
            return  1;
        }
        return fibonacciSum(n-2)+fibonacciSum(n-1);
    }
    public static void printFibonacci(int n){
            int n1= 0;
            int n2 = 1;
        if (n <= 0) {
            System.out.println("Invalid input");
        }
       else if(n ==1){
           System.out.println(n1);
       }
            else {
            System.out.print("Fibonacci Series : "+n1 +" "+n2+" ");
                while (n > 2){
                    int temp = n2;
                    n2 = n1 + n2;
                    n1 = temp;
                    n--;
                    System.out.print(n2+" ");
                }
            }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.println("Fibonacci series number at "+input+" position is : "+fibonacciSum(input));
        printFibonacci(input);

    }
}
