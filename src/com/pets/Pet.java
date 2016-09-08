package com.pets;

import com.equipment.DefaultPetInfo;
import com.equipment.PetInfo;
import com.example.try_gameengine.framework.Sprite;

public class Pet extends Sprite{
	
	public Pet(float x, float y, boolean autoAdd) {
		super(x, y, autoAdd);
		// TODO Auto-generated constructor stub
	}

	protected PetInfo petInfo = new DefaultPetInfo();
	
	public PetInfo getPetInfo(){
		return petInfo;
	}
}
