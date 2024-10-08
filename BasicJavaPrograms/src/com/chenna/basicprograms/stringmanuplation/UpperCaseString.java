package com.chenna.basicprograms.stringmanuplation;

import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseString {

	
	public static void main(String[] args) {
		
		List<String> strings= List.of("chenna", "hiremath", "viraj", "hiremath");
		
		List<String> upperCase = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
	
		
		upperCase.forEach(System.out::println);
		
		for (String string : upperCase) {
			System.out.println(string);
		}
		
	}
}
