package com.chenna.basicprograms.stringmanuplation;

import java.util.Arrays;
import java.util.List;

public class RevereseString {
	
	public static String str="InnovaSolutions";
	
	public static void main(String[] args) {
		//reveresStr(str);
		
		List<String> list = Arrays.asList("a", "b", "c");

        // Using lambda expression to iterate over the list
        list.forEach(set -> System.out.println(set));
	}

	
	public static void reveresStr(String str) {
		
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println();
		
		System.out.println(sb.reverse());
		
	}
	
}



