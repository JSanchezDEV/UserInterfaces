package upm.userinterfaces;

import upm.domotics.LivingLab;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;

public class BlindsActivity extends Activity {
	//para DEBUG
	private static final String TAG = "Blinds";
	
	private Switch sAll,sRoom,sLivingRoom,sKitchen;
	
	private OnCheckedChangeListener occl_All = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.raiseAllBlinds();
	        	Log.d(TAG,"subir todas");
	        	
	        } else{
	        	LivingLab.lowerAllBlinds();
	        	Log.d(TAG,"bajar todas");
	        }
	    }
	},
	occl_Room = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.RoomBlindRaise();
	        	Log.d(TAG,"subir room");
	        } else{
	        	LivingLab.RoomBlindLower();
	        	Log.d(TAG,"bajar room");
	        }
	    }
	},
	occl_LivingRoom = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.livingRoomBlindRaise();
	        	Log.d(TAG,"subir livingroom");
	        } else{
	        	LivingLab.livingRoomBlindLower();
	        	Log.d(TAG,"bajar livingroom");
	        }
	    }
	},
	occl_Kitchen = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.kitchenBlindRaise();
	        	Log.d(TAG,"subir cocina");
	        } else{
	        	LivingLab.kitchenBlindLower();
	        	Log.d(TAG,"bajar cocina");
	        }
	    }
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_blinds);
		
		sAll=(Switch) findViewById(R.id.sBlindsAll);
		sAll.setOnCheckedChangeListener(occl_All);
		sRoom=(Switch) findViewById(R.id.sBlindsRoom);
		sRoom.setOnCheckedChangeListener(occl_Room);
		sLivingRoom=(Switch) findViewById(R.id.sBlindsLivingRoom);
		sLivingRoom.setOnCheckedChangeListener(occl_LivingRoom);
		sKitchen=(Switch) findViewById(R.id.sBlindsKitchen);
		sKitchen.setOnCheckedChangeListener(occl_Kitchen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.blinds, menu);
		return true;
	}

}
