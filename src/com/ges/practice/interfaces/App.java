package com.ges.practice.interfaces;

import java.util.*;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Developer("Bilal", "FTE", 60, "java");
		Employee e2 = new Developer("Arshaq", "FTE", 60, "C++");
		List team1 = new ArrayList();
		team1.add(e1);
		team1.add(e2);
		Iterator iterator = team1.iterator();
		while (iterator.hasNext()) {
			Employee e = (Employee) iterator.next();
			e.printInfo();
			System.out.println("Is Employee safe during a layoff? --> " + keepDuringLayoffs(e));
		}		
	}
	
	public static boolean keepDuringLayoffs(Employee e) {
		if (e instanceof Dispensable) {
			return false;
		}
		return true;
	}
	
}
