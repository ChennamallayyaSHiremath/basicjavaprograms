package com.chenna.basicprograms.stringmanuplation;

public class SumOfDigits {
    public static void main(String[] args) {
    	
//    	int sum = 0;
//        int[] input = {11, 23, 24};
//        int[] input2=new int[input.length];
//       // List<Integer> result = new ArrayList<>();
//
//        //for (int j = 0; j < input.length; j++) {
//        	for (int num : input) {              
//                while (num > 0) {
//                    sum += num % 10;
//                    num /= 10;                   
//                }           
//              //result.add(sum); 
//                for (int i = 0; i < input2.length; i++) {
//                	System.out.println(input2[i] + " ");  // Output: [2, 5, 6]
//        		}
//                //input2[j]=sum;
//                //System.out.println( input2[j]=sum);
//            }
//        	
//        	 //System.out.println(sum);
//		//}
//       
//        
//        
//       
//        
//        
    	// Predefined array of integers with 5 elements
        int[] numbers = {123, 456, 789, 101, 202};

        // Create another array to store the sum of digits for each number
        int[] sumOfDigitsArray = new int[numbers.length];

        // Loop through each number in the array to calculate the sum of digits
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int sum = 0;
            int temp = number; // Store the original number in a temporary variable

            // Calculate the sum of digits for the current number
            while (temp > 0) {
                sum += temp % 10; // Add the last digit to the sum
                temp /= 10;       // Remove the last digit from the number
            }

            // Store the sum in the sumOfDigitsArray
            sumOfDigitsArray[i] = sum;
        }

        // Output the original numbers and their corresponding sum of digits
        System.out.println("Original numbers and their corresponding sum of digits:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i] + ", Sum of digits: " + sumOfDigitsArray[i]);
        }
    }
    	
}