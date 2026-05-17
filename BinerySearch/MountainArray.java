package BinerySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,4,3,2};
        System.out.println(mountainArrayInSearch(arr));
    }

    static  int mountainArrayInSearch(int[] arr){
       int start = 0;
       int end = arr.length -1;
       
       while(start < end){
            int mid  = start + (end - start) / 2;

            if(arr[mid] > arr[mid +1]){
                end = mid;
            } else {
                start = mid + 1;
            }
       }

       return start;
    }
}
