package BinerySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {23,20,19,17,16,14,13,12,11,10,3,2}; //Descending order
        // int[] arr = {2,3,5,6,8,9,10,12,14,16,24};  // Asc Order
        int targate = 10;
        System.out.println(orderAgnosticBS(arr, targate));
    }

    static int orderAgnosticBS(int[] arr, int targate){
       int start = 0;
       int end = arr.length-1;
  
      boolean isAsc = arr[start] < arr[end];

       while(start <= end){
          // int mid = (start -end) / 2 ; //May be acccet range of integer
           int mid = start + (end - start) / 2 ;
           
           if(arr[mid] == targate){
             return mid;
           }

           if(isAsc){
                if(targate < arr[mid] ){
                    end = mid - 1;   
                } else {
                    start = mid + 1;
                }
           } else {
                if(targate > arr[mid] ){
                    end = mid - 1;   
                } else {
                    start = mid + 1;
                }
           }
       }

       return -1;
    }
}
