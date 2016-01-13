package com.effect;

import com.enemy.Enemy;
import com.equipment.DefaultEquipment;
import com.equipment.Equipment;
import com.equipment.PetInfo;
import com.equipment.SlowerEquipmentDecorator;
import com.pets.Pet;

public class FrozenEffect extends Effect{
	int debuffTime = 1;
	
//	public void doEffect(Script script){
//		script.noMove();
//		scirpt.noAttack();
//		script.Debuff();
//	}
	
	@Override
	public void doEffect(Pet pet, Pet enemy){
		
		Equipment equipment = new SlowerEquipmentDecorator(new DefaultEquipment(enemy.getPetInfo()));
		equipment.getInfo();
	}
	
}
