package com.ges.practice.interfaces;

public abstract class DefaultEmployee implements Employee, WorkHours {
	
	private String name;
	private int code;
	private double ratePerHour;
	private String type;
	
	public DefaultEmployee(String name, String type, double ratePerHour) {
		this.name = name;
		this.ratePerHour = ratePerHour;
		this.type = type;
		this.code = HRUtil.getEmployeeCode();
	}
	
	public int getCode() {
		return code;
	}
	
	public String getName() {
		return name.toUpperCase();
	}
	
	public double getRatePerHour() {
		return ratePerHour;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public String getFullName() {
		return name.toUpperCase();
	}
	
	@Override
	public double getAnnualSalary() {
		if ("FTE".equals(type.toUpperCase())) {
			return 52 * 5 * ratePerHour * HOURS_FTE;
		} 
		return 52 * 5* ratePerHour * HOURS_C;
	}
	
	@Override
	public String getEmployeeType() {
		return type.toUpperCase();
	}
	
	

}
