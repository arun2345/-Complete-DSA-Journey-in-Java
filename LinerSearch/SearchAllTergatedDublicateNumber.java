package LinerSearch;

import java.util.ArrayList;

public class SearchAllTergatedDublicateNumber {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20};

        int terget = 20;
        ArrayList<Integer> result = allTargetDuplicateNumber(arr, terget);

        System.out.println(result);
    }

    static ArrayList<Integer> allTargetDuplicateNumber(int arr[], int terget){
         ArrayList<Integer> arrData = new ArrayList<>();
        if(arr.length == 0){
            return arrData;
        }
        
       
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == terget) {
                arrData.add(index);
            }
        }

        return arrData;
    }
}
