package com.chenna.basic.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StoreObjects {
	
	public static void main(String[] args) {
		
		List<Person> person=new ArrayList<>();
		
		person.add(new Person(26, "Nandan"));
		person.add(new Person(25, "Amasi"));
		person.add(new Person(37, "Jugga Navya"));
		person.add(new Person(22, "Chicken Jabba"));
		
		List<Person> filteredList = person.stream().filter(people -> people.getAge() > 25).collect(Collectors.toList());
		
		filteredList.forEach(System.out::println);
		
		Collections.sort(person, Comparator.comparingInt(Person::getAge));
		
		person.forEach(System.out::println);
		
	}

}
