
import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,10};
        sortArr(arr);
    }

    static void sortArr(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
               if(arr[j] > arr[j+1]) {
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
               }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
