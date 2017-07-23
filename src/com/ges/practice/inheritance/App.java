package com.ges.practice.inheritance;

public class App {

	public static void main(String[] args) {
		Person p2 = new Sportsperson("Messi", 20, "Soccer");
		Person p3 = new TennisPlayer("Roger", 30, "Tennis", "Wilson");
		System.out.println(getTypeOfInstance(p2));
		System.out.println(getTypeOfInstance(p3));
	}
	
	public static String getTypeOfInstance(Person p) {
		if (p instanceof TennisPlayer) {
			System.out.println("Tennis Player property: " + ((TennisPlayer) p).getEquipment());
			return "This is a tennis player";
		} else if (p instanceof Sportsperson) {
			return "This is a sportsperson";
		} else if (p instanceof Person) {
			return "This is a normal person";
		} else {
			return "Don't know who this is :| ";
		}
	}
	
}
