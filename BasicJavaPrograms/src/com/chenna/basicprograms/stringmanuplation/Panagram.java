package com.chenna.basicprograms.stringmanuplation;

public class Panagram {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		checkPanagaram(str1);
	}

	
	public static void checkPanagaram(String str) {
		
		str=str.replace(" ", "");
		
		char[] charArray=str.toCharArray();
		int sizeOfCharArray = charArray.length;
		
		int[] a= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int i=0;
		
		while (i != sizeOfCharArray) {
			int index = charArray[i]-65;
			a[index]=1;
			i++;
		}
		
		i=0;
		while(i != 26) {
			if(a[i]==1) {
			++i;
			}
		else {
			System.out.println("String is not panagram");
			System.exit(0);
		}
	}
	System.out.println("String is a panagram");
	
		
	}
}
