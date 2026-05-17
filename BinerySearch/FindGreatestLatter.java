package BinerySearch;

public class FindGreatestLatter {
     public static void main(String[] args) {
        char[] latter = {'c','f','j'};
        char targate = 'z';

        System.out.println(findGreatestLatter(latter, targate));
    }

    static  char findGreatestLatter(char[] latter, char targate){
        int start = 0;
        int end = latter.length -1;

        while(start <= end){
            int mid  = start + (end - start) / 2;
            if(targate < latter[mid] ){
              end = mid - 1;   
            } else {
                start = mid + 1;
            } 
        }
        return latter[start % latter.length] ;
    }
}
