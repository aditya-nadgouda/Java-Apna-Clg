import java.util.Scanner;

public class A03_CreateUsernameFromEmail {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String email = in.nextLine();
        System.out.println("Your email is : "+ email);
        String username = " ";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@'){
                break;
            }
            username +=email.charAt(i);
        }
        System.out.println("Your username is : "+ username);


    }
}
