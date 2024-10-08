package com.chenna.basic.interviewquestions;

public class WithoutLambdaExample {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry"};

        // Sort the array in reverse order using an anonymous inner class
//        Arrays.sort(words, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s2.compareTo(s1);
//            }
//        });

       // System.out.println(Arrays.so); // Output: [cherry, banana, apple]
        
        for (int i = words.length -1; i >= 0; i--) {
			
        	System.out.println(words[i]);
        	
		}
    }
}

