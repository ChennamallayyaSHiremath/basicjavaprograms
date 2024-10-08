package com.chenna.basicprograms.stringmanuplation;

public class SingleCharOccurence {
	
	public static void main(String[] args) {
		
		singleCharOccurence();
	}
	
	
	public static void singleCharOccurence() {
		
		String str="Viraj Hiremath";
		
		char c='z';
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == c) {
				count++;
			}
		}
		
		System.out.println(c + " char has repeated " + count + " times");
		
		
	}

}
