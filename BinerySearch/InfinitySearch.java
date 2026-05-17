package BinerySearch;

public class InfinitySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,12,14,16,37,38,46,48};
        int target = 5; 

        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[start]) {
           int temp = end +1;
           // end = previous end  + sizeofBox * 2
           end = end + (end - start + 1)*2;

           start = temp;

        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

       while(start <= end){
           int mid = start + (end - start) / 2 ;
           if(target < arr[mid] ){
              end = mid - 1;   
           } else if(target > arr[mid]){
              start = mid + 1;
           } else {
              return mid;
           }
       }

       return -1;

    }

}
