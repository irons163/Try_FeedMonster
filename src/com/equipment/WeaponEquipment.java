package com.equipment;

public class WeaponEquipment extends Equipment{
//	PetInfo info;
	
	public WeaponEquipment(PetInfo info){
		super(info);
//		this.info = info;
		description = "Weapon";
	}
	
//	public WeaponEquipment(){
//		description = "Weapon";
//	}
	
	@Override
	public PetInfo getInfo() {
		// TODO Auto-generated method stub
		
		return petInfo;
	}
}
