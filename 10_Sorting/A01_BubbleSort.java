import java.util.Arrays;

public class A01_BubbleSort {

    public static void main(String[] args) {

//        int [] arr = {7, 9 , 3 , 4, 1};
//        int n =  arr.length;
//        System.out.println(Arrays.toString(arr));
//
//        // Time complexity : O(n^2)
//        // Bubble sort :
//        for (int i = 0 ; i < n-1 ; i++){
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j]> arr[j+1]){
//                    // swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));

        // Bubble sort

        int arr[] = {4,5,0,1,3};
        int n = arr.length;

        System.out.println(Arrays.toString(arr));

        for (int i = 0 ; i < n-1 ; i++){
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j]>arr[j+1]){ 
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));




    }
}
