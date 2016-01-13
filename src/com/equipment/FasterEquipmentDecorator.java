package com.equipment;

public class FasterEquipmentDecorator extends EquipmentDecorator{

	public FasterEquipmentDecorator(Equipment equipment){
//		super(petInfo);
		this.equipment = equipment;
	}
	
	@Override
	String getDescription(){
		return description + ", Faster";
	}
	
	@Override
	public PetInfo getInfo() {
		// TODO Auto-generated method stub+
		PetInfo info = equipment.getInfo();
		info.setAgility(2 * info.getAgility());
		return info;
	}
	
}
