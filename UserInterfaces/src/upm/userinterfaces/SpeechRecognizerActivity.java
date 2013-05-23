

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SpeechRecognizerActivity extends Activity
{
	private SpeechRecognizer sr;
	private TextView tv;
	private Button b;
	
	@Override
	public void onDestroy()
	{
		super.onDestroy();
		sr.stopListening();
		sr.cancel();
		sr.destroy();
	}

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        b = (Button)findViewById(R.id.b);
        tv = (TextView)findViewById(R.id.txt);
 
        b.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) { startVoiceRecognitionActivity(); }
		});
        PackageManager pm = getPackageManager();
        List<ResolveInfo> activities = pm.queryIntentActivities(new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH), 0);
        if (activities.size() == 0)
        {
            tv.setText("Recognizer not present");
        }
        sr = SpeechRecognizer.createSpeechRecognizer(this);       
        sr.setRecognitionListener(new SpeechRecognitionListener());       
    }

	public class SpeechRecognitionListener implements RecognitionListener          
	{
        public void onReadyForSpeech(Bundle params) {}
        public void onBeginningOfSpeech() {}
        public void onRmsChanged(float rmsdB) {}
        public void onBufferReceived(byte[] buffer) {}
        public void onEndOfSpeech() {}
        public void onError(int error) {}
        public void onResults(Bundle results)                   
        {
        	ArrayList<String> al = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
            String res = "";
            int i=0;
            for (String s:al)
            {
            	res += "\n" + s;
            	Log.i("Speech Recognition "+i, s);
            	i++;
            }
            tv.setText(res);
        }
        public void onPartialResults(Bundle partialResults) {}
        public void onEvent(int eventType, Bundle params) {}
	}
 
    private void startVoiceRecognitionActivity()
    {
    	Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);        
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 3); 
        sr.startListening(intent);
    }

}