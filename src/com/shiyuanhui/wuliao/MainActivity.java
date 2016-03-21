package com.shiyuanhui.wuliao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button button1;
	private Button button2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 button1 = (Button)findViewById(R.id.button1);
		 button2 = (Button)findViewById(R.id.button2);
		 button1.setOnClickListener(new Button1Click());
		 button2.setOnClickListener(new Button2Click());
	}
    class Button1Click implements OnClickListener{

		@Override
		public void onClick(View view) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, FirstActivity.class);
			startActivity(intent);
			
		}
    	
    }
    class Button2Click implements OnClickListener{

		@Override
		public void onClick(View view) {
			Toast t = Toast.makeText(MainActivity.this, "¿Í¹Ù±ð×ßÑ½£¬ÍæÍæßÂ", Toast.LENGTH_LONG);
			t.show();	
		}
    	
    }
	
	
}
