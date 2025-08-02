package PracticeQuestions;

import java.util.Scanner;

public class A01_AverageOfThreeNum {
    public static double average(float a , float b, float c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers to calculate Average : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println("Average : "+average(a,b,c));

    }

}
