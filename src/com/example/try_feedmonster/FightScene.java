package com.example.try_feedmonster;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

import com.example.try_gameengine.framework.GameView;
import com.example.try_gameengine.framework.IGameController;
import com.example.try_gameengine.framework.IGameModel;
import com.example.try_gameengine.framework.LayerManager;
import com.example.try_gameengine.scene.EasyScene;

public class FightScene extends EasyScene{
	GameView gameView;
	GameDog gameDog;
	
	public FightScene(Context context, String id, int level) {
		super(context, id, level);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public void initGameView(Activity activity, IGameController gameController,
			IGameModel gameModel) {
		// TODO Auto-generated method stub
		gameView = new GameView(activity, gameController, gameModel);	
	}
	
//	@Override
//	public boolean onTouchEvent(MotionEvent event) {
//		// TODO Auto-generated method stub
//		LayerManager.onTouchLayers(event);
//		return true;
//	}

	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		LayerManager.drawLayers(canvas, null);
	}

	@Override
	public void beforeGameStart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void arrangeView(Activity activity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setActivityContentView(Activity activity) {
		// TODO Auto-generated method stub
		activity.setContentView(gameView);
	}

	@Override
	public void afterGameStart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sceneWillStart(Object obj){
		GameDog received = (GameDog)obj;
		this.gameDog = new GameDog(null, 200f, 100f, true);
		this.gameDog.setBitmapAndAutoChangeWH(received.getBitmap());
		
//		atk
//		tool
//		change
//		exit
		
	}
	
	private void atk(){
		this.gameDog.getState();
	}
	
	private void tool(){
		
	}
	
	private void change(){
		
	}
	
	private void exit(){
		
	}
	
	
}
