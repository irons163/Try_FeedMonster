package com.example.try_feedmonster;
public class ActionThread extends Thread{
	private int sleepSpan = 5000;
	boolean flag = true;
//	Sample_8_3 activity;
	GameScene scene;
	public ActionThread(GameScene scene){
		this.scene = scene;
	}	
	public void run(){
		while(flag){
			try{
				Thread.sleep(sleepSpan);
			}
			catch(Exception e ){
				e.printStackTrace();
			}
//			activity.myHandler.sendEmptyMessage(1);
			scene.action();
		}
	}
}