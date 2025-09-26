import java.util.Arrays;

public class A02_SelectionSort {
    public static void main(String[] args) {

        int [] arr = {1,9,4,7,2,6};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;

        // Time Complexity : O(n^2)
        // Selection sort

//        for (int i = 0; i < n-1 ; i++) {
//            int smallestIndex = i;
//            for (int j = i+1; j < n ; j++) {
//                if (arr[j] < arr[smallestIndex] ){
//                    smallestIndex = j;
//                }
//            }
//            int temp = arr[i] ;
//            arr[i] = arr[smallestIndex];
//            arr[smallestIndex]=temp;
//        }

//        System.out.println(Arrays.toString(arr));

        for (int i = 0 ; i < n-1 ; i++){
            int smallestIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[smallestIndex]){
                    smallestIndex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i]= arr[smallestIndex];
            arr[smallestIndex]=temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
