package LinerSearch;

public class SearchMaxValueIn2DArray {
 public static void main(String[] args) {
        int [][] arr = {
            {2,4,50,4,6,8},
            {43,5,62,6,8,22},
            {54,22,5,4,200,2,5}
        };

        int ans = searchData(arr);

        System.out.println(ans);
    }

    static int searchData(int arr[][]){

        int max = Integer.MIN_VALUE;
        if(arr.length == 0){
            return  -1;
        }

        for (int[] arr1 : arr) {
            for (int ele : arr1) {
                if (ele > max) {
                    max = ele;
                }
            }
        }

        return max;
    }
}
