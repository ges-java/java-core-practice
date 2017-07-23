package com.ges.practice.inheritance;

public abstract class Person {

	private int age;
	private String name;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void printInfo();
	
	protected String getInfo() {
		return "I am " + name + " and I am " + age + " years old!";
	}
	
}
