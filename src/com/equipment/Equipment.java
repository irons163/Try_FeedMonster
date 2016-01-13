package com.equipment;

public abstract class Equipment {
	protected String description = "Unknown";
	protected PetInfo petInfo;
	
	public Equipment(PetInfo petInfo) {
		// TODO Auto-generated constructor stub
		this.petInfo = petInfo;
	}
	
	public Equipment() {

	}
	
	String getDescription(){
		return description;
	}
	
	public abstract PetInfo getInfo();
	

}
