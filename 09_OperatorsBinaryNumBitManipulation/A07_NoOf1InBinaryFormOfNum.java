import java.util.Scanner;
//Write a program to count the number of 1’s in a binary representation of the number.
public class A07_NoOf1InBinaryFormOfNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = num;
        // Logic 1 . Using Bitwise AND
            // check last Bit using : N & 1
            // Move forward remove last bit : N >> 1

        int count = 0;
        while (num>0){
            if ((num & 1) == 1){  // get last bit
                count++;
            }
            num= num>>1; // remove last bit
        }
        System.out.println("Number of 1's in binary: " + count);


        count = 0;
        //Logic 2: Brian Kernighan’s Algorithm (More Efficient)
        while (n > 0){
            n = n & (n - 1);
            count ++;

        }
        System.out.println("Number of 1's in binary by Brian Kernighan’s Algorithm : " + count);






    }
}
