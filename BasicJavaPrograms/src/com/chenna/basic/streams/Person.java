package com.chenna.basic.streams;

public class Person {
	
	private int age;
	private String name;
	
	public Person(int age, String name) {
		this.name=name;
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person{name: '" + name + "' age:" + age + "}";
		//return "Person{name='" + name + "', age=" + age + "}";
	}

}
