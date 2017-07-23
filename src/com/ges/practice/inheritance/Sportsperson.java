package com.ges.practice.inheritance;

public class Sportsperson extends Person {
		
	private String sportName;

	public String getSportName() {
		return sportName;
	}
	
	public Sportsperson(String name, int age, String sportName) {
		super(name, age);
		this.sportName = sportName;
	}

	@Override
	public void printInfo() {
		
	}
	
}
