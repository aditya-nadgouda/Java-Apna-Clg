import java.util.Scanner;
//        *             *
//        * *         * *
//        * * *     * * *
//        * * * * * * * *
//        * * * * * * * *
//        * * *     * * *
//        * *         * *
//        *             *
public class A10_ButterflyPattern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                if ((i>=j && i+j <= n+1) || (j>=i && i+j>=n+1)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
