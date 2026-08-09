package MathDSA;

import java.util.Arrays;

public class PractiesDSA {
    public static void main(String[] args) {
        int arr[] = {3, 4, 4, 7, 8, 10};
 
        int  x =5;

        // int result = findMaxElement(arr);

        // System.out.println(result);
       

        int[] result = getFloorAndCeil(arr, x);

        System.out.println(Arrays.toString(result));
    }

     static  int[] getFloorAndCeil(int[] nums, int x) {
        int floorValue = 0;
        int ceilValue = 0;
        int[] arr = new int[10];
        

        for(int i = 0; i < nums.length; i++){
             for (int j = 1; j < nums.length; j++){
                  if( nums[i] == x){
                      floorValue = nums[i];
                        arr[i]  = nums[i];
                        
                     
                  }

                  if( nums[j] == x){
                      ceilValue = nums[j];
                       arr[j] = nums[j];
                      
                  }

                  if( nums[j] > x && nums[i] < x ){
                      ceilValue = nums[j];
                      floorValue = nums[i];

                      arr[i]  = nums[i];
                      arr[j] = nums[j];

                      return  arr;
                    //   System.out.println("terget is grater than j:" +  nums[j]);
                    //    System.out.println("terget is less than i:" +  nums[i]);

                  }


             }
        }

        // int[] arr = {floorValue, ceilValue};

         return arr;
    }


    static int findMaxElement(int[] num){
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(num[i] > maxNumber){
                maxNumber = num[i];
            }
        }

        return maxNumber;
    }


    static int[] runningSum(int[] arr){
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            j = j + arr[i];
            arr[i] = j;
        }

        return arr;
    }

    static int[] twoSortedArray(int[] arr1, int[] arr2){
        
        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n) {
            result[k++] = arr1[i++];
        }

        while (j < m) {
            result[k++] = arr2[j++];
        }

        return result;
    }

     static int[] MoveAllZerosToEnd(int[] arr){
         int j = 0;
        for (int i = 0; i < arr.length; i++) {
             
                if(arr[i] != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    j++;
                }
                
            
        }

        return arr;
     }


    static int[] removeDublicate(int[] arr){
       
        int[] result = new int[6];
        int j = 0;
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i] != arr[i+1]){
                result[j] = arr[i];
                j++;
            } 

        }

        return result;
    }


    static int[] insetElement(int[] arr, int index, int value){

        int[] result = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }

        result[index] = value;

        for (int i = index; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    public static int[] deleteAtIndex(int[] arr, int index) {
        int[] result = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }

        for(int i = index+1; i < arr.length; i++){
            result[i - 1] = arr[i];
        }

        return result;

    }

    static  int[] reverseArray(int[] arr){
        // int arr1[] = new int[arr.length];
        
        //  int j = 0;
        // for (int i = arr.length - 1; i >= 0; i--) {
        //      arr1[j] = arr[i];
        //      j++;
        // }

        //  {10,20,30,40,50};

        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

         return arr;
    }

     static int[] leftRotateOne(int[] arr){
      
        int first = arr[0];
       

        for (int i = 0; i < arr.length -1; i++) {
            arr[i] = arr[i+1];
        }

        arr[arr.length -1] = first;

        return  arr;
     }

     static int[] rightRotateOne(int[] arr){
      
        int last = arr[arr.length -1];
       

        for (int i = arr.length-1 ; i > 0 ;i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = last;

        return  arr;
     }

    public static void reverse(int[] arr,int start,int end){

        while(start<end){

            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

    }


      static int[] rightRotateKth(int[] arr, int k){
        //  1,2,3,4,5,6  k = 3
        //  3,2,1,4,5,6
        // 6,5,4,1,2,3

        int n=arr.length;

        // k=k%n;

        reverse(arr,0,k-1);

        reverse(arr,k,n-1);

        reverse(arr,0,n-1);

        return arr;
      }
}
