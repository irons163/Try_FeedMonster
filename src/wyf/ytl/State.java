package wyf.ytl;


public abstract class State {  //所有狀態類別型的基礎類別
//	protected Sample_8_3 activity;
	protected GameDog gameDog;
	public State(GameDog gameDog){//建構式
//		this.activity = activity;
		this.gameDog = gameDog;
	}
//	public abstract State toNextState(MasterAction ma);	
	
	public abstract void bath();
	public abstract void engage();
	public abstract void find();
	public abstract void alone();
}

class HappyState extends State{ //表示高興狀態的類別
	public HappyState(GameDog gameDog) {//建構式
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
		gameDog.activity.myImageView.setImageResource(R.drawable.common);//換圖
		gameDog.activity.myTextView.setText("狀態：普通");	
		gameDog.setState(gameDog.getCommonState());
	}
}
class CommonState extends State{ //表示普通狀態的類別
	public CommonState(GameDog gameDog) {//建構式
		super(gameDog);
	}
	
	@Override
	public void bath() {
		// TODO Auto-generated method stub
		gameDog.activity.myImageView.setImageResource(R.drawable.happy);//換圖
		gameDog.activity.myTextView.setText("狀態：高興");	
		gameDog.setState(gameDog.getHappyState());
	}
	@Override
	public void engage() {
		// TODO Auto-generated method stub
		gameDog.activity.myImageView.setImageResource(R.drawable.happy);//換圖
		gameDog.activity.myTextView.setText("狀態：高興");
		gameDog.setState(gameDog.getHappyState());
	}
	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alone() {
		// TODO Auto-generated method stub
		gameDog.activity.myImageView.setImageResource(R.drawable.away);//換圖
		gameDog.activity.myTextView.setText("狀態：出走");	  
		gameDog.setState(gameDog.getAwayState());
	}
}
class AwayState extends State {//表示出走狀態的類別
	public AwayState(GameDog gameDog) {//建構式
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
		gameDog.activity.myImageView.setImageResource(R.drawable.common);//換圖
		gameDog.activity.myTextView.setText("狀態：普通");
		gameDog.setState(gameDog.getCommonState());
	}
	@Override
	public void alone() {
		// TODO Auto-generated method stub
		
	}
}