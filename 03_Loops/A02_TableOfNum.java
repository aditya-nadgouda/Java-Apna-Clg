
//Print the table of number whichever user gives.

import java.util.Scanner;

public class A02_TableOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int num = in.nextInt();
        System.out.println("Table for : "+ num);
        int i = 1;
        while (i<=10){
            System.out.println(i*num);
            i++;
        }
        System.out.println();
    }
}
