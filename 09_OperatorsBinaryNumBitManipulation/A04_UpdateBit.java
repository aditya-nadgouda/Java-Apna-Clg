import java.util.Scanner;

public class A04_UpdateBit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int oprt = in.nextInt();

        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;
        int result  ;
        if (oprt == 1){
            // set
             result = bitmask | n;
        }
        else {
            // clear
            int newBitmask =  ~bitmask;
           result = newBitmask & n;
        }

        System.out.println(result);

    }
}
