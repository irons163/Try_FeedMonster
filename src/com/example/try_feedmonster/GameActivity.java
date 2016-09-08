package com.example.try_feedmonster;

import android.os.Bundle;

import com.example.try_gameengine.scene.Scene;
import com.example.try_gameengine.scene.SceneManager;
import com.example.try_gameengine.stage.Stage;

public class GameActivity extends Stage{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		BitmapUtil.initBitmap(this);
		initStage();
	}
	
	@Override
	public SceneManager initSceneManager() {
		// TODO Auto-generated method stub
		SceneManager sceneManager = new SceneManager();
		GameScene gameScene = new GameScene(this, "0", 0);
		sceneManager.addScene(gameScene);
		sceneManager.addScene(FightScene.class, this, "1");
		sceneManager.startScene(0);
		return sceneManager;
	}

}
