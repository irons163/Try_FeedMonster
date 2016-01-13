package com.food;

import com.equipment.Equipment;
import com.equipment.PetInfo;

public class ChocolateFood extends Food{
	Equipment equipment;
	
	public ChocolateFood(Equipment equipment){
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
