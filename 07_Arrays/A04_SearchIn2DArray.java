import java.util.Scanner;

public class A04_SearchIn2DArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] array = new int[2][3];

        System.out.println("Add numbers in array: ");
        //input
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]= in.nextInt();
            }
        }

        //Printing array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Enter a number to search : ");

        int input = in.nextInt();

        //Searching
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]==input){
                    System.out.println("number found at index : ("+i+","+j+")");
                }
            }
        }
    }
}
