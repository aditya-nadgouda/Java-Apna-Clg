import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        //input
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String name = in.next();
        in.nextLine();
        String Surname = in.nextLine();
        int b = in.nextInt();
        System.out.println("Sum : " + (a + b));
    }
}
