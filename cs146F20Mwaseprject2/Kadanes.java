package cs146F20Mwaseprject2;

import java.util.Scanner;

class Kadanes {
    /*Maximum sub array using Kadane's algorithm */
    public static int dynamicProgramming(int[] array){
        int maxSum = 0;
        int maxTemp = 0;
        int arrive = -1;
        int depart = -1;
        int tempArrive = 0;

        //a sum less than 0 is not considered, similar to brute force but discards any sums < 0
        for (int i = 0; i < array.length; i++) {
            maxTemp = maxTemp + array[i];
            if (maxTemp < 0){
                maxTemp = 0;
                arrive =  i + 1;
            }
            if (maxSum < maxTemp){
                maxSum = maxTemp;
                depart = i;
                tempArrive = arrive;
            }
        }
        arrive = tempArrive;
        return  maxSum;
    }
    
    public static long getRandomNumber(int size, int min, int max) {
        long duration = 0;
        long elapsed = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) ((Math.random() * (max - min)) + min);
            long startTime = System.nanoTime();
            dynamicProgramming(array);
            long endTime = System.nanoTime();
            duration = (endTime - startTime);

        }
        return duration;
    }
    
    public static void main(String[] args){
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
    

}
