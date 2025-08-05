import java.util.Scanner;

public class A01_Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] numbers = new int [size];

        for (int i = 0 ; i<size ; i++){
            numbers[i]= in.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
