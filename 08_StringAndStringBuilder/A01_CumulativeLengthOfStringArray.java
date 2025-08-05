import java.util.Scanner;

public class A01_CumulativeLengthOfStringArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine();
        String[] strArr = new String[size];
        int totalLength = 0;
        //input
        for (int i = 0; i < size; i++) {
            strArr[i]=in.nextLine();
            totalLength = totalLength + strArr[i].length();
        }

        System.out.println("Cumulative length of strings in array = "+ totalLength);
    }
}
