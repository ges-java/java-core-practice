package com.ges.memorystuff;

public class TestApp {
	
	public static void main(String[] args) {
		//stringCheck();
		//primitiveIntCheck();
		objectIntCheck();
	}
	
	public static void stringCheck() {
		String name1 = "Adam";
		String name3 = name1;
		name1 = "Ben";
		System.out.println(name3); // prints "Adam"
	}
	
	public static void primitiveIntCheck() {
		int num1 = 14;
		int num2 = num1;
		num1 = 56;
		System.out.println(num2); // prints 14
	}
	
	public static void objectIntCheck() {
		Integer num1 = new Integer(14);
		int num2 = num1;
		num1 = new Integer(56);
		System.out.println(num2); // prints 14
	}

}
