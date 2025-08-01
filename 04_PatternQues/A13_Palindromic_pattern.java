import java.util.Scanner;

public class A13_Palindromic_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <=n; i++) {
            //Spaces
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }

            //First half
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }

            //second half
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
