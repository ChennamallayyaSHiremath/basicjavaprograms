package com.chenna.basicprograms.stringmanuplation;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,1,2,3,5,6,9,2,1,6};
		
		//Set<Integer> setInt=new HashSet<Integer>();
		
		//Set<Integer> setInt=new TreeSet<Integer>();
		
		Set<Integer> setInt=new LinkedHashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			setInt.add(arr[i]);	
		}
		System.out.println(setInt);
		
		//int[] arr2 = null;
		
		//System.arraycopy(arr, 0, arr2, 3, 8);

	}

}
