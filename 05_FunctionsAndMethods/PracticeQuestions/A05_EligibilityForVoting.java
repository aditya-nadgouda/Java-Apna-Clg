package PracticeQuestions;

import java.util.Scanner;

public class A05_EligibilityForVoting {

    public static void isEligible(float age){
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible !!!");
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age : ");
        isEligible(in.nextFloat());
    }
}
