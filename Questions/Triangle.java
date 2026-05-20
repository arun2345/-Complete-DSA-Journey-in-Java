package Questions;

public class Triangle {
    public static void main(String[] args) {
        int[][] triangle = {{-10}};
        System.out.println(minimumTotal(triangle));
    }

    static int minimumTotal(int[][] arr){
         int sum = 0;
         for (int row = 0; row < arr.length; row++) {
            int minNumber = Integer.MAX_VALUE;
            for (int col = 0; col < arr[row].length; col++) {
                 if(arr[row][col] < minNumber){
                    minNumber = arr[row][col];
                 }
            }
            sum += minNumber;

        }

        return sum;
        
    }
}
