package BinerySearch;

public class BinarySearchAlg {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,10,12,14,16,24};
        int targate = 10;
        System.out.println(binarySearch(arr, targate));
    }

    static int binarySearch(int[] arr, int targate){
       int start = 0;
       int end = arr.length-1;

       while(start <= end){
          // int mid = (start -end) / 2 ; //May be acccet range of integer
           int mid = start + (end - start) / 2 ;

           if(targate < arr[mid] ){
              end = mid - 1;   
           } else if(targate > arr[mid]){
              start = mid + 1;
           } else {
              return mid;
           }
       }

       return -1;

    }
}
