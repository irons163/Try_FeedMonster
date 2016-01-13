package wyf.ytl;

import com.equipment.DefaultPetInfo;
import com.equipment.PetInfo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayUIActivity extends Activity{
	TextView strInfo, agiInfo, vitInfo, intInfo, dexInfo, lukInfo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.ui);
		
		strInfo = (TextView)findViewById(R.id.strInfo);
		agiInfo = (TextView)findViewById(R.id.agiInfo);
		vitInfo = (TextView)findViewById(R.id.vitInfo);
		intInfo = (TextView)findViewById(R.id.intInfo);
		dexInfo = (TextView)findViewById(R.id.dexInfo);
		lukInfo = (TextView)findViewById(R.id.lukInfo);
		
		PetInfo petInfo = Sample_8_3.gameDog.getPetInfo();
		
		strInfo.setText(petInfo.getStrength()+"");
		agiInfo.setText(petInfo.getAgility()+"");
		vitInfo.setText(petInfo.getVitality()+"");
		intInfo.setText(petInfo.getIntelligence()+"");
		dexInfo.setText(petInfo.getDexterity()+"");
		lukInfo.setText(petInfo.getLuck()+"");
		
	}
	
}
