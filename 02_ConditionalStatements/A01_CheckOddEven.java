import java.util.Scanner;

public class A01_CheckOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = in.nextInt();
        if (a%2==0){
            System.out.println("It's an even number");
        }
        else {
            System.out.println("It's an odd number");
        }
    }
}
