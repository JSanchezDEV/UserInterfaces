package upm.userinterfaces;

import upm.domotics.LivingLab;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity
{

	private Button bLucesOn, bLucesOff;
	private OnClickListener 
	
		oclEncenderLuces = new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				LivingLab.allLightsOn();
			}
		},
	
		oclApagarLuces = new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				LivingLab.allLightsOff();
			}
		};
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		bLucesOn = (Button)findViewById(R.id.bLucesOn);
		bLucesOff = (Button)findViewById(R.id.bLucesOff);
		
		bLucesOn.setOnClickListener(oclEncenderLuces);
		bLucesOff.setOnClickListener(oclApagarLuces);
	}
}
