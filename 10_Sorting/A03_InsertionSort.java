import java.util.Arrays;

public class A03_InsertionSort {

    public static void main(String[] args) {
        int [] arr = {1,9,4,7,2,6};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;

//       for (int i = 1; i < n ; i++){
//           int current = arr[i];
//           int j = i-1;
//           while (j>=0 && arr[j]>current){
//                   arr[j+1]=arr[j];
//                   j--;
//           }
//           arr[j+1]=current;
//
//       }


        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        System.out.println(Arrays.toString(arr));
    }
}
