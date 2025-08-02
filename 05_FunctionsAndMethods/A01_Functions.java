import java.util.Scanner;

public class A01_Functions {


    public static int addingTwoNum (int a, int b ){
        int sum = a + b;
        return sum;
    }

    public static int multiplyTwoNum (int a , int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers to add : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = addingTwoNum(num1,num2);
        System.out.println("Addition = "+ sum);
        System.out.println("Multiplication = "+multiplyTwoNum(num1,num2));
    }
}
