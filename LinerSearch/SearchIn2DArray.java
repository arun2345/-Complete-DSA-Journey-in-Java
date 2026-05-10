package LinerSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
            {2,4,50,4,6,8},
            {43,5,62,6,8,22},
            {54,22,5,4,2,2,5}
        };

        int terget = 5;

        int ans[] = searchData(arr,terget);

        System.out.println(Arrays.toString(ans));
    }

    static int[] searchData(int arr[][],  int terget){
        if(arr.length == 0){
            return new int[] {0, 0};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                 if(arr[row][col] == terget){
                    return new int[] {row,col};
                 }
            }
        }

         return new int[] {-1,-1};
    }
}
