package com.skill;
import java.util.ArrayList;
import java.util.List;

import com.effect.Effect;
import com.effect.FrozenEffect;
import com.enemy.Enemy;
import com.pets.Pet;


public class HeavyHitSkill extends Skill{
	static List<Effect> effects;
	
	static{
		effects = new ArrayList<Effect>();
		effects.add(new FrozenEffect());
	}
	
	@Override
	public void effects(Pet pet, Pet enemy){
//		effects.add(object);
		for(Effect effect : effects){
			effect.doEffect(pet, enemy);
		}
	}
	
}
