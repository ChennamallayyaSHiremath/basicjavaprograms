package com.chenna.basic.interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AvergaeMarks {

	public static void main(String[] args) {
		
		Map<Integer, Student> mapValue=new HashMap<Integer, Student>();
		
		mapValue.put(1, new Student("Chenna", 90));
		mapValue.put(2, new Student("Sharath", 99));
		mapValue.put(3, new Student("Mukesh",100));
		mapValue.put(4, new Student("Naveen",30));
		mapValue.put(5, new Student("Naveen",60));
		
		int totalMarks=0;
		int numberOfStudents=mapValue.size();
		
		for (Entry<Integer, Student> entry:mapValue.entrySet()) {
			Student student=entry.getValue();
			System.out.println(student);
			totalMarks += student.getMarks();
		}
		
		double avergaeMarks = (double) totalMarks / numberOfStudents;
		
		System.out.println(avergaeMarks);
		
	}
	
	
}
