package com.ges.practice.interfaces;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Developer("Bilal", "FTE", 60, "java");
		e1.printInfo();	
		System.out.println("Is Employee safe during a layoff? --> " + keepDuringLayoffs(e1));
	}
	
	public static boolean keepDuringLayoffs(Employee e) {
		if (e instanceof Dispensable) {
			return false;
		}
		return true;
	}
	
}
