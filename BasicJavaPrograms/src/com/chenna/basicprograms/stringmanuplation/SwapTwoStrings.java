package com.chenna.basicprograms.stringmanuplation;

public class SwapTwoStrings {
	public static void main(String[] args) {
		
		swapString();
		
	}

public static void swapString() {
	
	String s1="Chenna";
	String s2="Hiremath";
	
	System.out.println("Before Swap s1 " + s1 + " s2 " + s2);
	
	s1=s1 + s2;
	
	System.out.println("After swap s1 "+ s1.substring(6) + " s2 " + s1.substring(0, 6));
}
	
}