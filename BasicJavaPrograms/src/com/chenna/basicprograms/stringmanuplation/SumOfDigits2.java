package com.chenna.basicprograms.stringmanuplation;

import java.util.ArrayList;
import java.util.List;

public class SumOfDigits2 {
    public static void main(String[] args) {
    	
    	sumOfDigitsUsingCollection();

    } 
    
    
    public static void sumOfDigitsUsingLoop() {
    	//int sum = 0;
        int[] input = {11, 23, 24};
        int[] input2=new int[input.length];
       // List<Integer> result = new ArrayList<>();

        for (int j = 0; j < input.length; j++) {
        	//for (int num : input) {           
        		int num=input[j];
        		int sum = 0;
        		int temp = num;
                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;                   
                }                         
                input2[j]=sum;
                System.out.println( input2[j]=sum);
            }

    }
    
    public static void sumOfDigitsUsingCollection() {
    	
        int[] input = {11, 23, 24};
       
        
       List<Integer> result = new ArrayList<>();

            	 for (int num : input) {
            		 int sum = 0;
                     while (num > 0) {
                         sum += num % 10;
                         num /= 10;                   
                     }  
                     result.add(sum);
				}         
        		                 
            	 System.out.println(result);  
        
    }

    }