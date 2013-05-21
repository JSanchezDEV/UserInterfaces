package upm.userinterfaces;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{

	private Button b;
	private OnClickListener ocl = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			// Vamos a lanzar una nueva Activity
			Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
			startActivity(intent);
			
			finish(); // Si dejamos esta linea, al volver de la segunda activity
			// regresamos a esta. Si quitamos la linea, esta activity "muere" al lanzar la segunda.
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b = (Button)findViewById(R.id.bMain);
		b.setOnClickListener(ocl);
		
	}

}
