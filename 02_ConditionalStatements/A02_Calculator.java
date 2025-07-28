import java.util.Scanner;

public class A02_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean istrue = true;
        while (istrue){
            System.out.println("Enter two numbers to perform operation : ");
            float a = in.nextFloat();
            float b = in.nextFloat();
            System.out.println("Choose which operation you want to perform (+,-,/,*) : ");
            char operation = in.next().charAt(0);
            System.out.println("-----------------------");
            switch (operation){
                case '+':
                    System.out.println("Sum : " + (a+b));
                    break;

                case '-':
                    System.out.println("Subtraction : "+ (a-b));
                    break;

                case '/' :
                    System.out.println("Division : "+ (a/b));
                    break;

                case '*' :
                    System.out.println("Multiplication : "+ (a*b));
                    break;

                default:
                    System.out.println("Invalid input");
            }


            System.out.println("You want to continue ? (y/n)");
            char ans = in.next().charAt(0);
            if (ans == 'n'){
                istrue = false;
                System.out.println("Exit!");
            }

        }

    }
}
