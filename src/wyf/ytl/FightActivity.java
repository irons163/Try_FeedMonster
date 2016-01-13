package wyf.ytl;

import com.enemy.Enemy;
import com.enemy.EnemyDog;
import com.pets.Pet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class FightActivity extends Activity implements OnClickListener {

	Button button1, button2, button3, button4;

	ImageView imageView, imageView2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.fight);

		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);

		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		
		imageView = (ImageView)findViewById(R.id.imageView1);
		imageView2 = (ImageView)findViewById(R.id.imageView2);
		
		createRandomEnemy();
	}
	Enemy enemy;
	private void createRandomEnemy(){
		enemy = new EnemyDog();
	}
	
	private void fight(){
		imageView2.setImageResource(R.drawable.away);
		
		float str = Sample_8_3.gameDog.getPetInfo().getStrength();
		
		Pet pet = Sample_8_3.gameDog;
		
		enemy.doSkill(pet);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:

			break;
		case R.id.button2:

			break;
		case R.id.button3:

			
			
			break;
		case R.id.button4:
			fight();

			break;
		default:
			break;
		}
	}
}
