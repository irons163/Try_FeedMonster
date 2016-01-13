package com.enemy;

import com.pets.Pet;
import com.skill.HeavyHitSkill;
import com.skill.Skill;

import android.Manifest.permission;
import android.graphics.Canvas;

public class Enemy extends Pet{
	enum EnemyType {
		Dog, Cat, Cow
	}
	
	EnemyType enemyType;
	
	Skill skill;
	
	public Enemy() {
		// TODO Auto-generated constructor stub
		skill = new HeavyHitSkill();
	}
	
	public void onDrow(Canvas canvas){
//		canvas.drawBitmap(bitmap, matrix, paint);
	}
	
	public void doSomething(){
//		ATTACK;
//		USE TOOL;
//		ECSPACT;
	}

	public void doSkill(Pet pet){
		skill.effects(this, pet);
	}
	
	
}
