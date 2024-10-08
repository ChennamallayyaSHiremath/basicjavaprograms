package com.chenna.basicprograms.stringmanuplation;

import java.util.LinkedHashSet;
import java.util.Set;

public class CheckEachCharOccurence {
	
	public static void main(String[] args) {
		eachCharOccurence();
	}

	public static void eachCharOccurence() {
		
		String str="VirajV";
		
		//Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		Set<Character> set=new LinkedHashSet<Character>();
		
		char[] charValue = str.toCharArray();
		
		for (char c : charValue) {
			set.add(c);
		}	
		
		for (char c2 : set) {
			System.out.println(c2 + "");
		}
		
		//set.forEach(System.out::println);
		
	}
}
