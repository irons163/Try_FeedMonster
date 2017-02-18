package com.example.try_feedmonster;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.try_gameengine.framework.ALayer;
import com.example.try_gameengine.framework.ButtonLayer;
import com.example.try_gameengine.framework.ButtonLayer.OnClickListener;
import com.example.try_gameengine.framework.GameView;
import com.example.try_gameengine.framework.IGameController;
import com.example.try_gameengine.framework.IGameModel;
import com.example.try_gameengine.framework.ILayer;
import com.example.try_gameengine.framework.LabelLayer;
import com.example.try_gameengine.framework.Layer;
import com.example.try_gameengine.framework.LayerManager;
import com.example.try_gameengine.scene.EasyScene;
import com.example.try_gameengine.scene.SceneManager;
import com.example.try_gameengine.stage.Stage;

public class GameScene extends EasyScene implements ButtonLayer.OnClickListener{
	
	public GameScene(Context context, String id, int level) {
		super(context, id, level);
		// TODO Auto-generated constructor stub
			
//        myImageView= new Layer(10, 10, true);
//        myImageView.setBitmapAndAutoChangeWH(BitmapUtil.common);
        myTextView = new LabelLayer("hello",150, 350, true);
        myTextView.setPosition(50, 150);
        myTextView.setTextColor(Color.WHITE);
        bath = new ButtonLayer("bath", 100, 100, true);
        bath.setPosition(50, 550);
        bath.setTextColor(Color.WHITE);
        engage = new ButtonLayer("engage", 100, 100, true);
        engage.setPosition(150, 550);
        engage.setTextColor(Color.WHITE);
        find = new ButtonLayer("find", 100, 100, true);
        find.setPosition(250, 550);
        find.setTextColor(Color.WHITE);
        store = new ButtonLayer("find", 100, 100, true);
        store.setPosition(50, 650);
        store.setTextColor(Color.WHITE);
        fight = new ButtonLayer("fight", 100, 100, true);
        fight.setPosition(150, 650);
        fight.setTextColor(Color.WHITE);
        ui = new ButtonLayer("ui", 100, 100, true);
        ui.setPosition(250, 650);
        ui.setTextColor(Color.WHITE);
        
        bath.setOnClickListener(this);//�s�W��ť
        engage.setOnClickListener(this);//�s�W��ť
        find.setOnClickListener(this);//�s�W��ť
        
        store.setOnClickListener(this);
        fight.setOnClickListener(this);
        ui.setOnClickListener(this);
        
        gameDog = new GameDog(this, 100, 100 , true);
        actionThread = new ActionThread(this);
        actionThread.start();//�Ұʫ�O�����

	}
	GameView gameView;
	
	
	

	
//	ALayer myImageView = null;//ImageView������ޥ�
	LabelLayer myTextView = null;//TextView������ޥ�
	ButtonLayer bath = null;//�~�����s
	ButtonLayer engage = null;//�r�˫��s
	ButtonLayer find = null;//�M����s 
	ButtonLayer store, fight, ui;
	static GameDog gameDog;//GameDog���ޥ�
	ActionThread actionThread;//��O��������ޥ�


	@Override
	public GameView initGameView(Activity activity, IGameController gameController,
			IGameModel gameModel) {
		// TODO Auto-generated method stub
		gameView = new GameView(activity, gameController, gameModel);
	}

	public void action(){
		gameDog.alone();
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
//		LayerManager.onTouchLayers(event);
		return super.onTouchEvent(event);
	}
	
	@Override
	public void process() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		LayerManager.getInstance().drawLayers(canvas, null);
		
		fight.drawSelf(canvas, null);
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
	public void onClick(ButtonLayer buttonLayer) {
		// TODO Auto-generated method stub
		if(buttonLayer == bath){//���U���O�~�����s
			gameDog.bath();
		}
		else if(buttonLayer == engage){//���U���O�r�˫��s
			gameDog.engage();
		}
		else if(buttonLayer == find){//���U���O�M����s
			gameDog.find();
		}
		else if(buttonLayer == store){//���U���O�M����s
			
		}
		else if(buttonLayer == fight){//���U���O�M����s
//			((Stage)context).getSceneManager().next(gameDog);
			((Stage)context).getSceneManager().startSceneWithNextSceneIndex(gameDog);
		}
//		else if(buttonLayer == ui){//���U���Oui���s
//			Intent intent = new Intent(Sample_8_3.this, PlayUIActivity.class);
//			startActivity(intent);
//		}
	}

}
