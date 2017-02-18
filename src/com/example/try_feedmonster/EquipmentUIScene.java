package com.example.try_feedmonster;

import android.app.Activity;
import android.content.Context;
import android.view.SurfaceHolder;

import com.equipment.PetInfo;
import com.example.try_gameengine.framework.ALayer;
import com.example.try_gameengine.framework.GameView;
import com.example.try_gameengine.framework.IGameController;
import com.example.try_gameengine.framework.IGameModel;
import com.example.try_gameengine.framework.Layer;
import com.example.try_gameengine.scene.EasyScene;

public class EquipmentUIScene extends EasyScene{
	private GameView gameView;
	private PetInfo petInfo;
	private ALayer petImageLayer;
	private ALayer currentHeadEquipmentImageLayer;
	private ALayer currentBodyEquipmentImageLayer;
	private ALayer currentHandsEquipmentImageLayer;
	private ALayer currentFootEquipmentImageLayer;
//	private ALayer currentDecorateEquipmentImage;

	/**
	 * @param context
	 * @param id
	 * @param level
	 * @param mode
	 */
	public EquipmentUIScene(Context context, String id, int level, int mode) {
		super(context, id, level, mode);
		// TODO Auto-generated constructor stub
		petImageLayer = new Layer();
		petImageLayer.setWidth(100);
		petImageLayer.setHeight(100);
		currentHeadEquipmentImageLayer = new Layer();
		currentHeadEquipmentImageLayer.setBitmap(bitmap); //before setw and seth;
		currentHeadEquipmentImageLayer.setWidth(100);
		currentHeadEquipmentImageLayer.setHeight(100);
		currentHeadEquipmentImageLayer.setY(petImageLayer.getTop());
		currentBodyEquipmentImageLayer = new Layer();
		currentBodyEquipmentImageLayer.setWidth(100);
		currentBodyEquipmentImageLayer.setHeight(100);
		currentBodyEquipmentImageLayer.setY(currentHeadEquipmentImageLayer.getTop());
		currentHandsEquipmentImageLayer = new Layer();
		currentHandsEquipmentImageLayer.setWidth(100);
		currentHandsEquipmentImageLayer.setHeight(100);
		currentHandsEquipmentImageLayer.setY(currentBodyEquipmentImageLayer.getTop());
		currentFootEquipmentImageLayer = new Layer();
		currentFootEquipmentImageLayer.setWidth(100);
		currentFootEquipmentImageLayer.setHeight(100);
		currentFootEquipmentImageLayer.setY(currentHandsEquipmentImageLayer.getTop());
		
		//list
		
		
		addChild(petImageLayer);
		addChild(currentHeadEquipmentImageLayer);
		addChild(currentBodyEquipmentImageLayer);
		addChild(currentHandsEquipmentImageLayer);
		addChild(currentFootEquipmentImageLayer);
	}

	@Override
	public GameView initGameView(Activity activity, IGameController gameController,
			IGameModel gameModel) {
		// TODO Auto-generated method stub
		gameView = new GameView(activity, gameController, gameModel);	
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

}
