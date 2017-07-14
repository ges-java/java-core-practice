package com.ges.example;

import com.ges.creatures.Dog;
import com.ges.creatures.Human;

public class TestApp {
	
	/*
	 * Main method
	 */
	public static void main(String[] args) {
		//
		Human h1 = new Human("Adam");
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println(h1.height);
		System.out.println(h1.weight);
		System.out.println(h1.isMale);
		Human h2 = new Human("Ben", 5);
		System.out.println(h2.name);
		System.out.println(h2.age);
		System.out.println(h2.height);
		System.out.println(h2.weight);
		System.out.println(h2.isMale);
		Human h3 = new Human("Calvin", 4, 30, 20);
		System.out.println(h3.name);
		System.out.println(h3.age);
		System.out.println(h3.height);
		System.out.println(h3.weight);
		System.out.println(h3.isMale);
		Human h4 = new Human("Debra", 4, 30, 20, false);
		System.out.println(h4.name);
		System.out.println(h4.age);
		System.out.println(h4.height);
		System.out.println(h4.weight);
		System.out.println(h4.isMale);
	}
	
	/*
	 * Method that prints dog's name
	 */
	public static void printDogName() {
		Dog dog1 = new Dog("Tiger", 5);
		System.out.println(dog1.getName());
	}
	
	public static int getSumOfIntegers(int num1, int num2) {
		int sum = num1 + num2;		
		return sum;
	}
	
	public static Human getHuman(Human human) {
		return human;
	}
		
}
