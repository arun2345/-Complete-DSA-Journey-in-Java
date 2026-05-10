package LinerSearch;

public class SearchNumber {
    public static void main(String[] args) {
       int arr[] = {12,3,31,11,45,643,32,5,22,6,77};
       int terget = 32;
       int ans = searchNum(arr,terget);
       System.out.println("Find index : "+ ans);
    }

    static int searchNum(int arr[], int terget){
       if(arr.length == 0){
         return -1;
       }
       
       for (int index = 0; index < arr.length; index++) {
          if(arr[index] == terget){
            return index;
          }
       }
       return 0;
    }
}


