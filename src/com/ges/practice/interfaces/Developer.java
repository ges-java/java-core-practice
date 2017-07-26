package com.ges.practice.interfaces;

public class Developer extends DefaultEmployee implements Dispensable {
	
	private String language;
	
	public Developer(String name, String type, double ratePerHour, String language) {
		super(name, type, ratePerHour);
		this.language = language;
	}

	@Override
	public void printInfo() {
		System.out.println("NAME: " + getName());
		System.out.println("EMPLOYEE CODE: " + getCode());
		System.out.println("EMPLOYEE TYPE: " + getType());
		System.out.println("ANNUAL SALARY: " + getAnnualSalary());
		System.out.println("LANGUAGE: " + language.toUpperCase());		
	}	

}
