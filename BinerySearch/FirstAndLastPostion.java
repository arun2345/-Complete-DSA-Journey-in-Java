package BinerySearch;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class FirstAndLastPostion {

    public static void main(String[] args) {

        int[] num = {2,3,5,6,7,7,7,7,7,7,8,8,9,10,12,13};
        int target = 8;

        System.out.println(Arrays.toString(firstAndLast(num, target)));
    }

    static int[] firstAndLast(int[] num, int target){

        int[] ans = {-1,-1};

        ans[0] = search(num, target, true);
        
        if(ans[0] != -1){
          ans[1]= search(num, target, false);
        }

        return ans;
    }

    static int search(int[] num, int target, boolean firstIndex){

        int ans = -1;

        int start = 0;
        int end = num.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target < num[mid]){
                end = mid - 1;
            }
            else if(target > num[mid]){
                start = mid + 1;
            }
            else{

                ans = mid;

                if(firstIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}