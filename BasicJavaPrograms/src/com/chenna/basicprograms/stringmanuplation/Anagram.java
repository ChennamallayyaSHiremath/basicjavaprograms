package com.chenna.basicprograms.stringmanuplation;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		//String x="SILENT";
		//String y="LISTEN";
		
		String x="A SILENT War";
		String y="Listen raw a";
		
		x=x.replace("  ", "");
		y=y.replace("  ", "");
		
		x=x.toUpperCase();
		y=y.toUpperCase();
		
		System.out.println(x + " " + y);
		
		char[] xArray = x.toCharArray();
		char[] yArray = y.toCharArray();
		
		Arrays.sort(xArray);
		Arrays.sort(yArray);
		
		boolean result = Arrays.equals(xArray, yArray);
		
		if (result == true) {
			
			System.out.println("String is Anagram");
		}else {
		System.out.println("String is not Anagram");
		}
		
	}

}
