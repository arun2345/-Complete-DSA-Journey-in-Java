package BinerySearch;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int targate = 8;
        
        int num = 69;
        int n = 4;
        System.out.println(NthRootNumber(n,num));

        //  System.out.println(findPeakElement(arr));
        //  System.out.println("First Occ " + firstOccurrenceIndex(arr, targate));
        //  System.out.println("Last Occ " + lastOccurrenceIndex(arr, targate));
    }

    static int NthRootNumber(int n, int m){
        int low = 1;
        int high = m;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int result = power(mid, n, m);

            if (result == 1) {
                return mid;
            } 
            else if (result == 0) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
     return  -1;
    }

    private static int power(int base, int exponent, int limit) {

        long result = 1;

        for (int i = 0; i < exponent; i++) {

            result *= base;

            // Avoid overflow and unnecessary calculation
            if (result > limit) {
                return -1;
            }
        }

        if (result == limit) {
            return 1;
        }

        return 0;
    }

    static int SqueOfNum(int num){
        int left = 1;
        int right = num;
        int ans = 0;

         while(left <= right){
             int mid = left + (right - left) / 2;

            if(mid * mid <= num){
                ans = mid;
                left = mid + 1;
            } else {
                right = mid-1;
            }
            
         }

         return ans;
    }

    static int findPeakElement(int[] arr){
        int left = 0;
        int right = arr.length -1;

         while(left < right){
            int mid = left +(right -left) /2;
            
            if(arr[mid] < arr[mid+1]){
                left = mid+1;
            } else {
                right = mid;
            }

         }

         return left;
    }

    static int findSingle(int[] arr){
        int left = 0;
        int right = arr.length -1;

         while(left < right){
            int mid = left +(right -left) /2;

            if (mid % 2 == 1) {
                mid--;
            }

            if(arr[mid] == arr[mid+1]){
                left = mid+2;
            } else{
                right = mid;
            }
         }

         return arr[left];
    }

    static int howManyTimeRotateTheArray(int[] arr){
        int left = 0;
        int right = arr.length -1;

        while(left < right){
            int mid = left +(right -left) /2;

            if(arr[mid] > arr[right]){
                left = mid +1;
            } else{
                right = mid;
            }

        }

        return left;
    }

    static int findMinNumberInRotatedSortedArray(int[] arr){
        int left = 0;
        int right = arr.length -1;

        //[4, 5, 6, 7, 0, 1, 2] target = 0

        while(left < right){
            int mid = left +(right -left) /2;

            if(arr[mid] > arr[right]){
                left = mid +1;
            } else{
                right = mid;
            }

        }

        return arr[left];

    }

    static int findMaxNumberInRotatedSortedArray(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;

        //[4, 5, 6, 7, 0, 1, 2] target = 0

        while(left < right){
            int mid = left +(right -left) /2;

            if(arr[mid] < arr[right]){
                left = mid + 1;
            } else{
                right = mid;
            }

        }

        return arr[right];

    }

    static boolean searchRotatedSortedArray(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;

        //[4, 5, 6, 7, 0, 1, 2] target = 0

        while(left <= right){
            int mid = left +(right -left) /2;

            if(arr[mid] == target){
                return true; // return mid
            }

            if (arr[left] <= arr[mid]) { // if 4 < 7 than true 5 < 0 false

                if(arr[left] <= target && target <= arr[mid]){
                    right = mid -1;
                } else{
                    left = mid +1;
                }

            } else {

                if(arr[mid] <= target && target <= arr[right]){
                    left = mid +1;
                } else{
                    right = mid -1;
                }

            }
        }

        return false;

    }

    static int countOccurrenceIndex(int[]arr, int target){
         int first = firstOccurrenceIndex(arr, target);

         if(first == -1){
            return 0;
         }
        int last = lastOccurrenceIndex(arr, target);

        return last - first +1;

    }

    static int firstOccurrenceIndex(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
        int occIndex = 0;
        while(start <= end){
            int mid  = start + (end - start) / 2;

            if(arr[mid] == target){
                occIndex = mid;
                end = mid-1;
            }

            if(arr[mid] < target ){ 
                start = mid + 1;
                occIndex += 1;  
            } else {
               end = mid - 1; 
            } 
  
        }

       return occIndex;
    }

    static int lastOccurrenceIndex(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
        int occIndex = -1;
        while(start <= end){
            int mid  = start + (end - start) / 2;

            if(arr[mid] == target){
                occIndex = mid;
                start = mid+1;
            }else if(arr[mid] < target ){ 
                start = mid + 1;
            } else {
               end = mid - 1; 
            } 
  
        }

       return occIndex;
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
