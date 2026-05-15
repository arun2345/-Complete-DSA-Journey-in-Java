package BinerySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,10,12,13};
        int targate = 14;

        System.out.println(ceilingNumber(arr, targate));
    }

    static  int ceilingNumber(int[] arr, int targate){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid  = start + (end - start) / 2;
            if(targate < arr[mid] ){
              end = mid - 1;   
            } else if(targate > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
