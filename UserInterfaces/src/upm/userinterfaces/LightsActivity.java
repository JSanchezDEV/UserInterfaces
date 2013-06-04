package upm.userinterfaces;

import upm.domotics.LivingLab;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
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
			setAllSwitches(isChecked);
	        if(isChecked){
	        	speak.speak("Todas las luces encendidas", false);
	        	LivingLab.allLightsOn();
	        	Log.d(TAG,"encender todas");
	        } else{
	        	speak.speak("Todas las luces apagadas", false);
	        	LivingLab.allLightsOff();
	        	Log.d(TAG,"apagar todas");
	        }
	    }
	},
	occl_Room = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			checkAllSwitches();
	        if(isChecked){
	        	speak.speak("Luz de la habitación encendida", false);
	        	LivingLab.roomLightsOn();
	        	Log.d(TAG,"encender room");
	        } else{
	        	speak.speak("Luz de la habitación apagada", false);
	        	LivingLab.roomLightsOff();
	        	Log.d(TAG,"apagar room");
	        }
	    }
	},
	occl_LivingRoom = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			checkAllSwitches();
	        if(isChecked){
	        	speak.speak("Luz del salón encendida", false);
	        	LivingLab.livingRoomLightsOn();
	        	Log.d(TAG,"encender livingroom");
	        } else{
	        	speak.speak("Luz del salón apagada", false);
	        	LivingLab.livingRoomOff();
	        	Log.d(TAG,"apagar livingroom");
	        }
	    }
	},
	occl_TVRoom = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			checkAllSwitches();
	        if(isChecked){
	        	speak.speak("Luz de la sala de televisión encendida", false);
	        	LivingLab.kitchenOn();
	        	Log.d(TAG,"encender tvroom");
	        } else{
	        	speak.speak("Luz de la sala de televisión apagada", false);
	        	LivingLab.kitchenOff();
	        	Log.d(TAG,"apagar tvroom");
	        }
	    }
	},
	occl_Kitchen = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			checkAllSwitches();
	        if(isChecked){
	        	speak.speak("Luz de la cocina encendida", false);
	        	LivingLab.roomLightsOn();
	        	Log.d(TAG,"encender kitchen");
	        } else{
	        	speak.speak("Luz de la cocina apagada", false);
	        	LivingLab.roomLightsOff();
	        	Log.d(TAG,"apagar kitchen");
	        }
	    }
	},
	occl_SinkFridge = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			checkAllSwitches();
	        if(isChecked){
	        	speak.speak("Luz del frigorífico encendida", false);
	        	LivingLab.sinkFridgeLightsOn();
	        	Log.d(TAG,"encender sinkfridge");
	        } else{
	        	speak.speak("Luz del frigorífico apagada", false);
	        	LivingLab.sinkFridgeLightsOff();
	        	Log.d(TAG,"apagar sinkfridge");
	        }
	    }
	},
	occl_KitchenOvenCooktop = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			checkAllSwitches();
	        if(isChecked){
	        	speak.speak("Luz del horno encendida", false);
	        	LivingLab.kitchenOvenCooktopLightsOn();
	        	Log.d(TAG,"encender kitchenovencooktop");
	        } else{
	        	speak.speak("Luz del horno apagada", false);
	        	LivingLab.kitchenOvenCooktopLightsOff();
	        	Log.d(TAG,"apagar kitchenovencooktop");
	        }
	    }
	},
	occl_Toilet = new OnCheckedChangeListener(){
		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			checkAllSwitches();
	        if(isChecked){
	        	speak.speak("Luz del aseo encendida", false);
	        	LivingLab.toiletLightsOn();
	        	Log.d(TAG,"encender toilet");
	        } else{
	        	speak.speak("Luz del aseo apagada", false);
	        	LivingLab.toiletLightsOff();
	        	Log.d(TAG,"apagar toilet");
	        }
	    }
	};
	
	private Speak speak;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lights);
		ActionBar actionBar = getActionBar();
	    actionBar.setDisplayHomeAsUpEnabled(true);
	    actionBar.setTitle(R.string.lights);
		
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
		
		speak = Speak.getInstance(this);
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case android.R.id.home:
	        	finish(); 
		        return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	private void setAllSwitches(boolean checked){
		sRoom.setChecked(checked);
		sLivingRoom.setChecked(checked);
		sTVRoom.setChecked(checked);
		sKitchen.setChecked(checked);
		sSinkFridge.setChecked(checked);
		sKitchenOvenCooktop.setChecked(checked);
		sToilet.setChecked(checked);
	}
	
	private void checkAllSwitches(){
		boolean[] switches={sRoom.isChecked(), sLivingRoom.isChecked(), sTVRoom.isChecked(), sKitchen.isChecked()
				,sSinkFridge.isChecked(), sKitchenOvenCooktop.isChecked(),sToilet.isChecked()};
		
		boolean all_on=switches[0];
		for(int i=1; i<switches.length;i++){
			all_on = all_on && switches[i];
		}
		
		if(all_on){
			sAll.setChecked(true);
		} else {
			sAll.setChecked(false);
			sRoom.setChecked(switches[0]);
			sLivingRoom.setChecked(switches[1]);
			sTVRoom.setChecked(switches[2]);
			sKitchen.setChecked(switches[3]);
			sSinkFridge.setChecked(switches[4]);
			sKitchenOvenCooktop.setChecked(switches[5]);
			sToilet.setChecked(switches[6]);
		}
	}
}
