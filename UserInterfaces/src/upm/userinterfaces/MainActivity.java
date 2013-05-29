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
			// Vamos a lanzar una nueva Activity
			Intent intent = new Intent(getApplicationContext(), LightsActivity.class);
			startActivity(intent);
			/*
			finish(); // Si dejamos esta linea, al volver de la segunda activity
			// regresamos a esta. Si quitamos la linea, esta activity "muere" al lanzar la segunda.*/
		}
	},
	
	ocl_Doors = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			Intent intent = new Intent(getApplicationContext(), DoorsActivity.class);
			startActivity(intent);
		}
	},
	
	ocl_Blinds = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			Intent intent = new Intent(getApplicationContext(), BlindsActivity.class);
			startActivity(intent);
		}
	};
	
	@Override
	protected void onCreate(Bundle bn)
	{
		super.onCreate(bn);
		setContentView(R.layout.activity_main);
		
		bLights = (Button)findViewById(R.id.bMainLights);
		bLights.setOnClickListener(ocl_Lights);
		bDoors = (Button)findViewById(R.id.bMainDoors);
		bDoors.setOnClickListener(ocl_Doors);
		bBlinds = (Button)findViewById(R.id.bMainBlinds);
		bBlinds.setOnClickListener(ocl_Blinds);
	}
}
