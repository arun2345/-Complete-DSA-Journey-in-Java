package LinerSearch;

public class SearchMaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {2,3,4,5},
            {3,2,5,3},
            {6,3,2,1}
        };

        System.out.println(maxwealth(accounts));

    }

    static int maxwealth(int[][] accounts){
       if(accounts.length == 0){
         return -1;
       }

     int ans = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;
            for (int per = 0; per < account.length; per++) {
                sum += account[per];
            }
            if(sum > ans){
                ans = sum;
            }
        }

       return ans;
    }
}
