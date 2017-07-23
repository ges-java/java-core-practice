package com.ges.practice.inheritance;

public class TennisPlayer extends Sportsperson {

	private String equipment;
	
	public TennisPlayer(String name, int age, String sportName, String equipment) {
		super(name, age, sportName);
		this.equipment = equipment;
	}
	
	public String getEquipment() {
		return equipment;
	}

	@Override
	public void printInfo() {
				
	}
	
}
