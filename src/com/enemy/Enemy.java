package com.enemy;

//import wyf.ytl.Pet;
import android.graphics.Canvas;

import com.pets.Pet;
import com.skill.HeavyHitSkill;
import com.skill.Skill;

public class Enemy extends Pet{
	public Enemy(float x, float y, boolean autoAdd) {
		super(x, y, autoAdd);
		// TODO Auto-generated constructor stub
		skill = new HeavyHitSkill();
	}

	enum EnemyType {
		Dog, Cat, Cow
	}
	
	EnemyType enemyType;
	
	Skill skill;
	

	
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
