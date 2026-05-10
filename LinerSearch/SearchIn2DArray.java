package LinerSearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
            {2,4,5,4,6,8},
            {43,5,62,6,8,22},
            {54,22,5,4,2,2,5}
        };

        int terget = 62;

        System.out.println(searchData(arr,terget));
    }

    static int searchData(int arr[][],  int terget){
        if(arr.length == 0){
            return -1;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                 if(arr[row][col] == terget){
                    return arr[row][col];
                 }
            }
        }

        return 0;
    }
}
