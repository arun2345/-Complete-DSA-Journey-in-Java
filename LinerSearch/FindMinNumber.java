package LinerSearch;

public class FindMinNumber {
     public static void main(String[] args) {
      int arr[] = {321,4,6,3,6,8,44,7,8,9,95,3};

      System.out.println(findMinNumber(arr));
    }

    static int findMinNumber(int arr[]){
       int minNumber = Integer.MAX_VALUE;

       if(arr.length == 0){
        return -1;
       }

       for (int i = 0; i < arr.length; i++) {
           if(arr[i] < minNumber){
              minNumber = arr[i];
           }
       }

       return minNumber;
    }
}
