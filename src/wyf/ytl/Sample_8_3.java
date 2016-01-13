package wyf.ytl;
import com.equipment.PetInfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class Sample_8_3 extends Activity implements OnClickListener, IStateObserver{
	ImageView myImageView = null;//ImageView控制項的引用
	TextView myTextView = null;//TextView控制項的引用
	Button bath = null;//洗澡按鈕
	Button engage = null;//逗弄按鈕
	Button find = null;//尋找按鈕 
	Button store, fight, ui;
	static GameDog gameDog;//GameDog的引用
	ActionThread actionThread;//後臺執行緒的引用
	Handler myHandler = new Handler(){//用來更新UI執行緒中的控制項
        public void handleMessage(Message msg) {
        	switch(msg.what){
        		case 1://為後臺執行緒發來的訊息
        			gameDog.alone();
        			break;
        	}
        }
	};	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.main);
        myImageView = (ImageView) this.findViewById(R.id.myImageView);//得到myImageView的引用
        myTextView = (TextView) this.findViewById(R.id.myTextView);//得到myTextView的引用
        bath = (Button) this.findViewById(R.id.bath);//得到bath的引用
        engage = (Button) this.findViewById(R.id.engage);//得到engage的引用
        find = (Button) this.findViewById(R.id.find);//得到find的引用
        
        store = (Button) this.findViewById(R.id.store);//得到find的引用
        fight = (Button) this.findViewById(R.id.fight);//得到find的引用
        ui = (Button) this.findViewById(R.id.ui);//得到find的引用
        
        bath.setOnClickListener(this);//新增監聽
        engage.setOnClickListener(this);//新增監聽
        find.setOnClickListener(this);//新增監聽
        
        store.setOnClickListener(this);
        fight.setOnClickListener(this);
        ui.setOnClickListener(this);
        
        gameDog = new GameDog(this);
        actionThread = new ActionThread(this);
        actionThread.start();//啟動後臺執行緒
        
    }
	public void onClick(View v) {//實現監聽器中的方法
		if(v == bath){//按下的是洗澡按鈕
			gameDog.bath();
		}
		else if(v == engage){//按下的是逗弄按鈕
			gameDog.engage();
		}
		else if(v == find){//按下的是尋找按鈕
			gameDog.find();
		}
		else if(v == store){//按下的是尋找按鈕
			
		}
		else if(v == fight){//按下的是尋找按鈕
			Intent intent = new Intent(Sample_8_3.this, FightActivity.class);
			startActivity(intent);
		}
		else if(v == ui){//按下的是ui按鈕
			Intent intent = new Intent(Sample_8_3.this, PlayUIActivity.class);
			startActivity(intent);
		}
	}
	
	@Override
	public void updateState() {
		// TODO Auto-generated method stub
		
	}
}
enum MasterAction {//表示主人動作的枚舉
	BATH_ACTION,		//洗澡
	ENGAGE_ACTION,		//逗弄
	FIND_ACTION,		//尋找
	ALONE_ACTION;		//無人搭理
}


