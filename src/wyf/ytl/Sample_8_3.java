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
	ImageView myImageView = null;//ImageView������ޥ�
	TextView myTextView = null;//TextView������ޥ�
	Button bath = null;//�~�����s
	Button engage = null;//�r�˫��s
	Button find = null;//�M����s 
	Button store, fight, ui;
	static GameDog gameDog;//GameDog���ޥ�
	ActionThread actionThread;//��O��������ޥ�
	Handler myHandler = new Handler(){//�Ψӧ�sUI������������
        public void handleMessage(Message msg) {
        	switch(msg.what){
        		case 1://����O������o�Ӫ��T��
        			gameDog.alone();
        			break;
        	}
        }
	};	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.main);
        myImageView = (ImageView) this.findViewById(R.id.myImageView);//�o��myImageView���ޥ�
        myTextView = (TextView) this.findViewById(R.id.myTextView);//�o��myTextView���ޥ�
        bath = (Button) this.findViewById(R.id.bath);//�o��bath���ޥ�
        engage = (Button) this.findViewById(R.id.engage);//�o��engage���ޥ�
        find = (Button) this.findViewById(R.id.find);//�o��find���ޥ�
        
        store = (Button) this.findViewById(R.id.store);//�o��find���ޥ�
        fight = (Button) this.findViewById(R.id.fight);//�o��find���ޥ�
        ui = (Button) this.findViewById(R.id.ui);//�o��find���ޥ�
        
        bath.setOnClickListener(this);//�s�W��ť
        engage.setOnClickListener(this);//�s�W��ť
        find.setOnClickListener(this);//�s�W��ť
        
        store.setOnClickListener(this);
        fight.setOnClickListener(this);
        ui.setOnClickListener(this);
        
        gameDog = new GameDog(this);
        actionThread = new ActionThread(this);
        actionThread.start();//�Ұʫ�O�����
        
    }
	public void onClick(View v) {//��{��ť��������k
		if(v == bath){//���U���O�~�����s
			gameDog.bath();
		}
		else if(v == engage){//���U���O�r�˫��s
			gameDog.engage();
		}
		else if(v == find){//���U���O�M����s
			gameDog.find();
		}
		else if(v == store){//���U���O�M����s
			
		}
		else if(v == fight){//���U���O�M����s
			Intent intent = new Intent(Sample_8_3.this, FightActivity.class);
			startActivity(intent);
		}
		else if(v == ui){//���U���Oui���s
			Intent intent = new Intent(Sample_8_3.this, PlayUIActivity.class);
			startActivity(intent);
		}
	}
	
	@Override
	public void updateState() {
		// TODO Auto-generated method stub
		
	}
}
enum MasterAction {//��ܥD�H�ʧ@���T�|
	BATH_ACTION,		//�~��
	ENGAGE_ACTION,		//�r��
	FIND_ACTION,		//�M��
	ALONE_ACTION;		//�L�H�f�z
}


