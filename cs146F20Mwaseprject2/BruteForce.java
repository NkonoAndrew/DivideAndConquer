package cs146F20Mwaseprject2;

import java.util.Scanner;

class BruteForce {
	/*Maximum sub-array, checks all possible sums and makes a comparison*/
    public static int maximumSub(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int value = 0;
            for (int j = i; j < array.length; j++) {
            	//add to previous summation
                value = value + array[j];
                if (value > max){
                    max = value;
                }
            }
        }
        return max;
    }
    
    public static void main(String[] args) {

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
            playAgain = scan.nextLine();

        }
        while(playAgain.equalsIgnoreCase("Y"));
        System.out.println("Thank you");
    }
    
    /*Time Analysis*/
    public static long getRandomNumber(int size, int min, int max) {
        long duration = 0;
        long elapsed = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) ((Math.random() * (max - min)) + min);
            long startTime = System.nanoTime();
            maximumSub(array);
            long endTime = System.nanoTime();
            duration = (endTime - startTime);

        }
        return duration;
    }
    
   
}
