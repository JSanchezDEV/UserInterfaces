package upm.userinterfaces;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
	private Button bLights,bDoors,bBlinds;
	private OnClickListener ocl_Lights = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			speak.speak("Luces", false);
			Intent intent = new Intent(getApplicationContext(), LightsActivity.class);
			startActivity(intent);
		}
	},
	
	ocl_Doors = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			speak.speak("Puertas", false);
			Intent intent = new Intent(getApplicationContext(), DoorsActivity.class);
			startActivity(intent);
		}
	},
	
	ocl_Blinds = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			speak.speak("Persianas", false);
			Intent intent = new Intent(getApplicationContext(), BlindsActivity.class);
			startActivity(intent);
		}
	};
	
	private Speak speak;
	
	@Override
	protected void onCreate(Bundle bn)
	{
		super.onCreate(bn);
		setContentView(R.layout.activity_main);
		setTitle(R.string.myhome);
		
		bLights = (Button)findViewById(R.id.bMainLights);
		bLights.setOnClickListener(ocl_Lights);
		bDoors = (Button)findViewById(R.id.bMainDoors);
		bDoors.setOnClickListener(ocl_Doors);
		bBlinds = (Button)findViewById(R.id.bMainBlinds);
		bBlinds.setOnClickListener(ocl_Blinds);
		
		speak = Speak.getInstance(this);
	}
}
