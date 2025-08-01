import java.util.Scanner;
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
public class A08_FloydsTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((num++) + " ");
            }
            System.out.println();
        }
    }
}
