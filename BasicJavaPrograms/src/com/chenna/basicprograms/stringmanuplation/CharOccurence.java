package com.chenna.basicprograms.stringmanuplation;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CharOccurence {

	static String str="ChennaHiremath";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chatGPTOccurence();
		
		System.out.println(" ================================ ");
		
		finDuplicateCharInString();
	}

	public static void chatGPTOccurence() {
		// Create a HashMap to store character frequencies
        Map<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();

        // Convert the string to a char array and iterate through it
        for (char c : str.toCharArray()) {
            // If the character is already in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If the character is not in the map, add it with count 1
                charCountMap.put(c, 1);
            }
        }

        // Print the character frequencies
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
        
        System.out.println("Entry set " + charCountMap.entrySet());
	}
	
	public static void finDuplicateCharInString() {
		
		 // Sets to track seen characters and duplicates
        Set<Character> seen = new LinkedHashSet<>();
        Set<Character> duplicates = new LinkedHashSet<>();
        
        // Iterate through the string
        for (char c : str.toCharArray()) {
            if (!seen.add(c)) {
                // If adding to 'seen' fails, it's a duplicate
                duplicates.add(c);
            }
        }

        // Print duplicates
        System.out.println("Duplicate characters in the string: " + duplicates);
	}
}
