
// Print sum of n natural numbers

import java.util.Scanner;

public class A01_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = in.nextInt();
        int sum = 0;
        while (n>0){
            sum +=n;
            n--;
        }
        System.out.println("Sum of n natural number = "+ sum);
    }
}
