package com.ges.practice.interfaces;

public class HRUtil {
	
	private static int employeeCode = 1;
	
	protected static int getEmployeeCode() {
		return employeeCode++;
	}

}
