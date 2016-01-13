package com.equipment;

public class PowerIncreaseEquipmentDecorator extends EquipmentDecorator{

	public PowerIncreaseEquipmentDecorator(Equipment equipment){
		this.equipment = equipment;
	}
	
	@Override
	String getDescription(){
		return description + ", Power";
	}
	
	@Override
	public PetInfo getInfo() {
		// TODO Auto-generated method stub+
		PetInfo info = equipment.getInfo();
		info.setStrength(10 + info.getStrength());
		return info;
	}

}
