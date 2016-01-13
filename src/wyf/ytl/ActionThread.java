package wyf.ytl;
public class ActionThread extends Thread{
	private int sleepSpan = 5000;
	boolean flag = true;
	Sample_8_3 activity;
	public ActionThread(Sample_8_3 activity){
		this.activity = activity;
	}	
	public void run(){
		while(flag){
			try{
				Thread.sleep(sleepSpan);
			}
			catch(Exception e ){
				e.printStackTrace();
			}
			activity.myHandler.sendEmptyMessage(1);
		}
	}
}