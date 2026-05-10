package LinerSearch;

public class SearchEvenDigits {
    public static void main(String[] args) {
        int[] arr = {32,4,5,67,7432,5,7,32};
        int ans = findNumber(arr);
        System.out.println("Even Number of digits: "+ ans);
    }

    static int findNumber(int[] arr){
        int count = 0;
        if(arr.length == 0){
            return 0;
        }

        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;

    }

    static boolean even(int num){
       int numberOfDigits = digit(num) ;
       if(numberOfDigits % 2 == 0){
            return true;
       }
       return false; 
    }

    static int digit(int num){
        int count = 0;
        while (num > 0) { 
            count++;
            num = num / 10;    
        }
        
        return count;
    }
}
