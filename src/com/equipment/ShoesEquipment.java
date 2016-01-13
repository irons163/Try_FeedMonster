package com.equipment;

public class ShoesEquipment extends Equipment{
//	PetInfo info;
	
	public ShoesEquipment(PetInfo info){
		super(info);
//		this.info = info;
		description = "Shoes";
	}
	
//	public ShoesEquipment(){
//		description = "Shoes";
//	}
	
	@Override
	public PetInfo getInfo() {
		// TODO Auto-generated method stub
		
		return petInfo;
	}

}
