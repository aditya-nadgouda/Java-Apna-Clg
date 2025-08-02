package PracticeQuestions;

import java.util.Scanner;

public class A04_CircumferenceOfCircle {
    public static double circumference (int r){
        //circumference of circle  C = 2 * pie * r
        return (2*3.14*r);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        int r = in.nextInt();
        System.out.println("Circumference = "+ circumference(r));

    }
}
