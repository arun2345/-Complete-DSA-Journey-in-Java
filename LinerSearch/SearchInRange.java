package LinerSearch;

public class SearchInRange {
    public static void main(String[] args) {
      int arr[] = {321,4,6,3,6,8,44,7,8,9,95,3};
      int start = 2;
      int end = 7;
      int terget = 44;

      System.out.println(searchInRangeData(arr,terget,start,end));
    }

    static int searchInRangeData(int arr[], int terget, int start, int end){
       if(arr.length == 0){
        return -1;
       }

       for (int i = start; i <= end; i++) {
           if(arr[i] == terget){
              return i;
           }
       }

       return 0;
    }
}
