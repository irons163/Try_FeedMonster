package com.equipment;

public class HatEquipment extends Equipment{
	PetInfo petInfo;
	
	public HatEquipment(PetInfo petInfo){
		super(petInfo);
		this.petInfo = petInfo;
		description = "Shoes";
	}
	
//	public HatEquipment(){
//		description = "Shoes";
//	}
	
	@Override
	public PetInfo getInfo() {
		// TODO Auto-generated method stub
		
		return petInfo;
	}

}
