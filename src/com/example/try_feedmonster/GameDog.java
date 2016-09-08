package com.example.try_feedmonster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import wyf.ytl.IStateObserver;
import wyf.ytl.Sample_8_3;

import com.equipment.DefaultPetInfo;
import com.equipment.DefaultWeaponEquipment;
import com.equipment.Equipment;
import com.equipment.PetInfo;
import com.pets.Pet;

//宣告套件語句
public class GameDog extends Pet {

//	Sample_8_3 activity = null; // activity的引用
	GameScene scene;
	private State currentState; // 寵物的初始當前狀態
	private ArrayList<IStateObserver> stateObservers = new ArrayList<IStateObserver>();

	private State happyState;
	private State commonState;
	private State awayState;

//	PetInfo petInfo;
	
	Map<String, Float> petInfos;
	
	Map<String, Equipment> equipments = new HashMap<String, Equipment>();
	
	public GameDog(GameScene scene, float x, float y, boolean autoAdd) {
		super(x, y, autoAdd);
		// TODO Auto-generated constructor stub
//		this.activity = activity;
		this.scene = scene;
		
		happyState = new HappyState(this);
		commonState = new CommonState(this);
		awayState = new AwayState(this);

		currentState = commonState;
		
		petInfo = new DefaultPetInfo();
		
		equipments.put("Weapen", new DefaultWeaponEquipment(petInfo));
		
		equipments.put("", new DefaultWeaponEquipment(petInfo));
	}
	
	public void bath() {
		// TODO Auto-generated method stub
		currentState.bath();
	}

	public void engage() {
		// TODO Auto-generated method stub
		currentState.engage();
	}

	public void find() {
		// TODO Auto-generated method stub
		currentState.find();
	}

	public void alone() {
		// TODO Auto-generated method stub
		currentState.alone();
	} 

	public State getHappyState() {
		return happyState;
		
	}

	public State getCommonState() {
 
		return commonState;

	}

	public State getAwayState() {
		return awayState;

	}

	public State getState() {
		return currentState;

	}
	
	public void setState(State state){
		this.currentState = state;
	}

//	@Override
//	public void registerObserver(IStateObserver stateObserver) {
//		// TODO Auto-generated method stub
//		stateObservers.add(stateObserver);
//	}
//
//	@Override
//	public void removeObserver(IStateObserver stateObserver) {
//		// TODO Auto-generated method stub
//		stateObservers.remove(stateObserver);
//	}
	
	@Override
	public PetInfo getPetInfo(){
		return petInfo;
	}

}