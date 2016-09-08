package com.example.try_feedmonster;

import android.graphics.BitmapFactory;
import wyf.ytl.R;


public abstract class State {  //�Ҧ����A���O������¦���O
//	protected Sample_8_3 activity;
	protected GameDog gameDog;
	public State(GameDog gameDog){//�غc��
//		this.activity = activity;
		this.gameDog = gameDog;
	}
//	public abstract State toNextState(MasterAction ma);	
	
	public abstract void bath();
	public abstract void engage();
	public abstract void find();
	public abstract void alone();
}

class HappyState extends State{ //��ܰ������A�����O
	public HappyState(GameDog gameDog) {//�غc��
		super(gameDog);
	}

	@Override
	public void bath() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void engage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void find() {
		// TODO Auto-generated method stub

	}

	@Override
	public void alone() {
		// TODO Auto-generated method stub
		gameDog.setBitmapAndAutoChangeWH(BitmapUtil.common);//����
		gameDog.scene.myTextView.setText("���A�G���q");	
		gameDog.setState(gameDog.getCommonState());
	}
}
class CommonState extends State{ //��ܴ��q���A�����O
	public CommonState(GameDog gameDog) {//�غc��
		super(gameDog);
	}
	
	@Override
	public void bath() {
		// TODO Auto-generated method stub
		gameDog.setBitmapAndAutoChangeWH(BitmapUtil.happy);//����
		gameDog.scene.myTextView.setText("���A�G���q");	
		gameDog.setState(gameDog.getHappyState());
	}
	@Override
	public void engage() {
		// TODO Auto-generated method stub
		gameDog.setBitmapAndAutoChangeWH(BitmapUtil.happy);//����
		gameDog.scene.myTextView.setText("���A�G���q");	
		gameDog.setState(gameDog.getHappyState());
	}
	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alone() {
		// TODO Auto-generated method stub
		gameDog.setBitmapAndAutoChangeWH(BitmapUtil.away);//����
		gameDog.scene.myTextView.setText("���A�G�X��");	  
		gameDog.setState(gameDog.getAwayState());
	}
}
class AwayState extends State {//��ܥX�����A�����O
	public AwayState(GameDog gameDog) {//�غc��
		super(gameDog);
	}

	@Override
	public void bath() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void engage() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void find() {
		// TODO Auto-generated method stub
		gameDog.setBitmapAndAutoChangeWH(BitmapUtil.common);//����
		gameDog.scene.myTextView.setText("���A�G���q");
		gameDog.setState(gameDog.getCommonState());
	}
	@Override
	public void alone() {
		// TODO Auto-generated method stub
		
	}
}