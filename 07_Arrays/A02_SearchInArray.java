import java.util.Scanner;

public class A02_SearchInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {10,30,11,20,98,94};
        System.out.println("Enter a number to check availability : ");
        int num = in.nextInt();
        boolean isAval = false;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==num){
                System.out.println("found at index : "+i);
                isAval = true;
            }
        }

        if (!isAval){
            System.out.println("Entered Number is not present in array : ");
        }

    }
}
