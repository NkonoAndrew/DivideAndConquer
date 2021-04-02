package cs146F20Mwaseprject2;

import java.util.Scanner;

class DivideAndConquer {


	/*Sub-array crosses midpoint*/
    public static int maximumCrossingSubArray(int[] array, int low, int mid, int high){

    	//Big number to use for comparison
        int leftSum = Integer.MIN_VALUE;
        //initialise the sum
        int sum = 0;
        
        //from 0 to mid, add elements and find the sum
        for (int i = mid; i >= low ; i--) {
            sum = sum + array[i];
            //compare sum with big number
            if (sum > leftSum){
                leftSum = sum;
            }
        }

        int rightSum = Integer.MIN_VALUE;
        int sum1 = 0;
        for (int j = mid + 1; j <= high ; j++) {
            sum1 = sum1 + array[j];
            if (sum1 > rightSum) {
                rightSum =  sum1;
            }
        }

        return  leftSum + rightSum;
    }


    /* Maximum sub array*/
    public static int maximumSubArray(int[] array, int low, int high){
    	//base case
        if (low == high){
            return array[0];
        }
        else {
            int mid = (high + low)/ 2;
            //recursive call if array is its on the left
            int leftSum = maximumSubArray(array, low, mid);
            //recursive call if array is its on the right
            int rightSum = maximumSubArray(array, mid + 1, high);
            //array such that it crosses the midpoint and is in the left and right 
            int crossSum = maximumCrossingSubArray(array, low, mid, high);
            
            /*compring the returned sums*/
            return max(leftSum, rightSum, crossSum);
        }
    }

    /*Highest sum from the 3 cases*/
    public static int max(int leftSum, int rightSum, int crossSum){
        if ((leftSum >= rightSum) & (leftSum >= crossSum))
            return leftSum;
        else if ((rightSum >= leftSum) & (rightSum >= crossSum))
            return rightSum;
        else
            return crossSum;
    }
    

    public static void main(String[] args)  {

    // System.out.println("The maximum sub-array is: " + maximumSubArray(array, 0, array.length - 1));

     String playAgain = "";
     Scanner scan = new Scanner(System.in);
     int count = 0;

     do
     {
         System.out.print("Enter a length of an array: ");
         int number = scan.nextInt();
         for (int i = 1; i <= 10 ; i++) {
             long random = getRandomNumber(number, -100, 100);
             count += random;
         }
         System.out.println(count/10);

         System.out.println("Would you like to play again? Enter Y to play or any other key to quit: ");
         playAgain = scan.nextLine();
         

     }
     while(playAgain.equalsIgnoreCase("Y"));
     System.out.println("Thank you");
 }
 public static long getRandomNumber(int size, int min, int max) {
    long duration = 0;
    long elapsed = 0;
    int[] array = new int[size];
    for (int i = 0; i < array.length ; i++) {
        array[i] = (int) ((Math.random() * (max - min)) + min);
        long startTime = System.nanoTime();
        maximumSubArray(array, 0, array.length - 1);
        long endTime = System.nanoTime();
        duration = (endTime - startTime);

    }
    return duration;
}

}
