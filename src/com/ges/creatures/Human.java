package com.ges.creatures;

public class Human {
	
	public String name;
	public int age;
	public int height;
	public int weight;
	public boolean isMale;
	private boolean hasDog;
	private Dog dog;
		
	// Constructors
	public Human(String name, int age, int height, int weight, boolean isMale) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.isMale = isMale;
	}
	
	public Human(String name) {
		this(name, 0, 15, 7, true);
	}
	
	public Human(String name, int age) {
		this(name, age, 15, 7, true);
	}
	
	public Human(String name, int age, int height, int weight) {
		this(name, age, height, weight, true);
	}	
	
	
	
}
