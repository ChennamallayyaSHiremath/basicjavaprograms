package com.chenna.basicprograms.stringmanuplation;

public class StringNumbers {

	public static void main(String[] args) {
		
		calculateTotalSum("10 50 90");
		
	}



public static void calculateTotalSum(String numberString) {
	
	String[] numbers = numberString.split(" ");
	
	int totalValue=0;
	
	for (String string : numbers) {
		totalValue +=Integer.parseInt(string);
	}
	
	System.out.println("Total number value is " + totalValue);
}
}