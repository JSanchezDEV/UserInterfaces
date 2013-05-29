package upm.userinterfaces;

import upm.domotics.LivingLab;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;

public class DoorsActivity extends Activity {
	
	//para DEBUG
	private static final String TAG = "Doors";
	
	private Switch sFront;
	
	private OnCheckedChangeListener occl_Front= new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.openFrontDoor();
	        	Log.d(TAG,"abrir front");
	        } else{
	        	LivingLab.closeFrontDoor();
	        	Log.d(TAG,"cerrar front");
	        }
	    }
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_doors);
		
		sFront= (Switch) findViewById(R.id.sDoorsFront);
		sFront.setOnCheckedChangeListener(occl_Front);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.doors, menu);
		return true;
	}

}
