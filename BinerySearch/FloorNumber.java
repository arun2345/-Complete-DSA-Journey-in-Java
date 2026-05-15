package BinerySearch;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,10,12,13};
        int targate = 4;

        System.out.println(floorNumber(arr, targate));
    }

    static  int floorNumber(int[] arr, int targate){
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
        return end;
    }
}
