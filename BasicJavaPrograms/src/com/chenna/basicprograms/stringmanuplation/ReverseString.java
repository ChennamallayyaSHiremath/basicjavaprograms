package com.chenna.basicprograms.stringmanuplation;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String[] names= {"Chenna", "Viraj","Tejashwini"};
		
		//String name="Tejashwini";

		
		for (int i = names.length -1; i >= 0; i--) {
			
			
			StringBuilder sb=new StringBuilder(names[i]);
			
			System.out.println(sb.reverse() + ",");
		}		
		
	}

}
