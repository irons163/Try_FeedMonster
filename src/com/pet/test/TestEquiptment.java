package com.pet.test;

import com.equipment.Equipment;
import com.equipment.FasterEquipmentDecorator;
import com.equipment.PetInfo;
import com.equipment.PowerIncreaseEquipmentDecorator;
import com.equipment.ShoesEquipment;
import com.equipment.WeaponEquipment;

import android.test.AndroidTestCase;

public class TestEquiptment extends AndroidTestCase{
	
	public void testShoesEquipment() throws Exception{
		PetInfo info = new PetInfo();
		info.setAgility(10);
		Equipment equipment = new FasterEquipmentDecorator(new ShoesEquipment(info));
		PetInfo newInfo = equipment.getInfo();
		assertEquals(20.0f, newInfo.getAgility());
	}
	
	public void testWeaponEquipment() throws Exception{
		PetInfo info = new PetInfo();
		info.setStrength(10);
		Equipment equipment = new PowerIncreaseEquipmentDecorator(new WeaponEquipment(info));
		PetInfo newInfo = equipment.getInfo();
		assertEquals(20.0f, newInfo.getStrength());
	}
}
