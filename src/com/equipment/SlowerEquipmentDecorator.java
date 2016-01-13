package com.equipment;

public class SlowerEquipmentDecorator extends EquipmentDecorator{

	public SlowerEquipmentDecorator(Equipment equipment){
		this.equipment = equipment;
	}
	
	@Override
	String getDescription(){
		return description + ", Slower";
	}
	
	@Override
	public PetInfo getInfo() {
		// TODO Auto-generated method stub+
		PetInfo info = equipment.getInfo();
		info.setAgility(0.5f * info.getAgility());
		return info;
	}
	
}
