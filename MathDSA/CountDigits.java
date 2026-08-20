package MathDSA;

public class CountDigits {
    public static void main(String[] args) {
        // int n = 0;
        // int result = countDigit(n);
        // System.out.println(result);

        int[] arr = {10, 10, 10,10,10};

        int largest = arr[0];
        int secondLargest = arr[0];

        for(int num : arr){
            if(num > largest){
               secondLargest = largest;
               largest = num;
            }

            if(num < largest && num > secondLargest){
                secondLargest = num;
            }
        }
        System.out.println("secondLargest :" + secondLargest);
        System.out.println("largest :" + largest);
        
        // int sumOfAllNumber = 0;
        // for(int num : arr){
        //     // sumOfAllNumber += num;
        //     System.out.println(num);
        // }

        // System.out.println(sumOfAllNumber);

        // for (int i = arr.length-1; i > 0; i--) {
        //     System.out.println(arr[i]);
        // }
          
        // int countEvenNumber = 0;
        // int countOddNumber = 0;
        //  for(int num : arr){
        //     if(num % 2 == 0){
        //          countEvenNumber++;
        //        System.out.println(num);
        //     } else {
        //         countOddNumber++;
        //     }
        // }

        // System.out.println("Even number:" + countEvenNumber);
        // System.out.println("Odd number:" + countOddNumber);
        

        // int sumOfAllNumber = 0;
        // for(int num : arr){
        //     sumOfAllNumber += num;
        //     System.out.println(num);
        // }

        // double avg = sumOfAllNumber / arr.length;

        // System.out.println("Length:"  + arr.length);
        // System.out.println("Sum of all number:"  + sumOfAllNumber);
        // System.out.println("Average of sum:"  + avg);

        // int largerElement = arr[0];
        // for(int num : arr){
        //     if(largerElement < num){
        //       largerElement = num;
        //     }
        //     System.out.println(num);
        // }

        // System.out.println("Largest Element: " + largerElement);

    }

    static int countDigit(int n) {
        if (n == 0) {
            return 1;
        }

        n = Math.abs(n); // Handle negative numbers

        int count = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            n = n /10;
            count++;
        }

        return count;
    }
}
