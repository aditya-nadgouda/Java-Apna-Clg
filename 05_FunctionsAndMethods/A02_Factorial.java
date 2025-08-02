import java.util.Scanner;

public class A02_Factorial {

    public static int factorial(int num ){
            int fac = 1;
            while (num>0){
                fac *=num;
                num--;
            }
            return fac;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num>0){
            System.out.println("Factorial = "+ factorial(num));
        }
        else
        {
            System.out.println("Invalid num !!!");
        }
    }
}
