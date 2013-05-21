package upm.userinterfaces;

import upm.domotics.LivingLab;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity
{

	// 0. Vamos a hacer una activity que tenga un boton. Al pulsarlo se enciende la luz de la cocina.
	// 1. Hacemos que la clase extienda activity
	// 2. Importamos las clases que hagan falta (Ctrl+shift+o)
	// 3. Creamos el metodo onCreate
	
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
		// 4. Importamos la clase bundle
		// 5. Invocamos al metodo super, sino la app se rompe al ejecutar la activity!
		
		super.onCreate(savedInstanceState);
		
		// 6. Mostramos el interfaz.
		// Si alguien quiere hacer monadas tipo quitar barra de arriba, pantalla completa... 
		// que me comente! El momento de hacerlo es antes de la siguiente linea
		
		setContentView(R.layout.second);
		
		// 7. Inicializamos los elementos (botones, etc etc)
		   // 7.1 Este es un buen momento para poner los atributos globales.
		   // asi que volvemos a la línea 10 y los ponemos ahi.
		
		// 8. Despues de poner los atributos, los inicializamos (si es que hace falta).
		// En nuestro caso se trata de un boton. Para ello necesitamos el id del mismo.
		// Lo miramos en el fichero res/layout/second.xml y si no tiene, se lo ponemos
		
		bLucesOn = (Button)findViewById(R.id.bLucesOn);
		bLucesOff = (Button)findViewById(R.id.bLucesOff);
		
		// 9. Volvemos a la linea 16 e implementamos los listeners del boton.
		// Y se los asignamos a cada uno :)
		
		bLucesOn.setOnClickListener(oclEncenderLuces);
		bLucesOff.setOnClickListener(oclApagarLuces);
		
		// 10. Y finalmente vamos al fichero AndroidManifest.xml
		// Si no esta incluida la actvity que estamos programando, la incluimos
		// Si falta algun permiso, como el de red, lo incluimos
		
		// Y hemos acabado! Ahora toca hacer un interfaz mas bonito y accesible :)
	}
}
