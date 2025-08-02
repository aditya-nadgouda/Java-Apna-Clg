package PracticeQuestions;

import java.util.Scanner;

public class A03_GreatestOfTwoNum {
    public static void greatestOfTwoNum(int a , int b){
        if (a > b){
            System.out.println(a + " is greatest");
        }
        else if (a==b){
            System.out.println("both are same");
        }
        else {
            System.out.println(b+" is greatest");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number's :");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        greatestOfTwoNum(num1,num2);
    }
}
