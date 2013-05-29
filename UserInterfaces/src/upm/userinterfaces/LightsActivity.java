package upm.userinterfaces;

import upm.domotics.LivingLab;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;

public class LightsActivity extends Activity {
	
	//para DEBUG
	private static final String TAG = "Lights";
	
	private Switch sAll,sRoom,sLivingRoom,sTVRoom,sKitchen,sSinkFridge,sKitchenOvenCooktop,sToilet;
	private OnCheckedChangeListener occl_All = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.allLightsOn();
	        	Log.d(TAG,"encender todas");
	        } else{
	        	LivingLab.allLightsOff();
	        	Log.d(TAG,"apagar todas");
	        }
	    }
	},
	occl_Room = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.roomLightsOn();
	        	Log.d(TAG,"encender room");
	        } else{
	        	LivingLab.roomLightsOff();
	        	Log.d(TAG,"apagar room");
	        }
	    }
	},
	occl_LivingRoom = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.livingRoomLightsOn();
	        	Log.d(TAG,"encender livingroom");
	        } else{
	        	LivingLab.livingRoomOff();
	        	Log.d(TAG,"apagar livingroom");
	        }
	    }
	},
	occl_TVRoom = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.kitchenOn();
	        	Log.d(TAG,"encender tvroom");
	        } else{
	        	LivingLab.kitchenOff();
	        	Log.d(TAG,"apagar tvroom");
	        }
	    }
	},
	occl_Kitchen = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.roomLightsOn();
	        	Log.d(TAG,"encender kitchen");
	        } else{
	        	LivingLab.roomLightsOff();
	        	Log.d(TAG,"apagar kitchen");
	        }
	    }
	},
	occl_SinkFridge = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.sinkFridgeLightsOn();
	        	Log.d(TAG,"encender sinkfridge");
	        } else{
	        	LivingLab.sinkFridgeLightsOff();
	        	Log.d(TAG,"apagar sinkfridge");
	        }
	    }
	},
	occl_KitchenOvenCooktop = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.kitchenOvenCooktopLightsOn();
	        	Log.d(TAG,"encender kitchenovencooktop");
	        } else{
	        	LivingLab.kitchenOvenCooktopLightsOff();
	        	Log.d(TAG,"apagar kitchenovencooktop");
	        }
	    }
	},
	occl_Toilet = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
	        if(isChecked){
	        	LivingLab.toiletLightsOn();
	        	Log.d(TAG,"encender toilet");
	        } else{
	        	LivingLab.toiletLightsOff();
	        	Log.d(TAG,"apagar toilet");
	        }
	    }
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lights);
		
		sAll = (Switch)findViewById(R.id.sLightsAll);
		sAll.setOnCheckedChangeListener(occl_All);
		sRoom = (Switch)findViewById(R.id.sLightsRoom);
		sRoom.setOnCheckedChangeListener(occl_Room);
		sLivingRoom = (Switch)findViewById(R.id.sLightsLivingRoom);
		sLivingRoom.setOnCheckedChangeListener(occl_LivingRoom);
		sTVRoom = (Switch)findViewById(R.id.sLightsTVRoom);
		sTVRoom.setOnCheckedChangeListener(occl_TVRoom);
		sKitchen = (Switch)findViewById(R.id.sLightsKitchen);
		sKitchen.setOnCheckedChangeListener(occl_Kitchen);
		sSinkFridge = (Switch)findViewById(R.id.sLightsSinkFridge);
		sSinkFridge.setOnCheckedChangeListener(occl_SinkFridge);
		sKitchenOvenCooktop = (Switch)findViewById(R.id.sLightsKitchenOvenCooktop);
		sKitchenOvenCooktop.setOnCheckedChangeListener(occl_KitchenOvenCooktop);
		sToilet = (Switch)findViewById(R.id.sLightsToilet);
		sToilet.setOnCheckedChangeListener(occl_Toilet);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lights, menu);
		return true;
	}

}
