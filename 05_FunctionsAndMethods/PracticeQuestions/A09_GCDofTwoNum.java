package PracticeQuestions;

import java.util.Scanner;
//Greatest common Divisor
public class A09_GCDofTwoNum {

    public static int smallest (int a , int b){
        if (a<b){
            return a;
        }
        return b;
    }
    public static int gcd (int n1, int n2){
        int i = 1;
        int gcd = 1;

        int smallest = smallest(n1,n2);

        while (i <= smallest){
            if (n1%i == 0 && n2%i==0){
                gcd = i ;
            }
            i++;
        }

        return gcd;
    }

    public static int gcdEuclideanAlgo(int n1 , int n2){
      // making number's positive
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        while (n2>0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;

    }
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("GCD using bruteforce : "+ gcd(num1,num2));
        System.out.println("GCD using Euclidean : "+ gcdEuclideanAlgo(num1,num2));
    }
}
