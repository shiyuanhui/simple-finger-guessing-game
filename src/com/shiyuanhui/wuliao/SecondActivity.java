package com.shiyuanhui.wuliao;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SecondActivity extends Activity{
	private Button secondbujubutton;
	private RadioGroup rgroup2;
	private RadioButton r2button1;
	private RadioButton r2button2;
	private RadioButton r2button3;
	public static String string2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondbuju);
		rgroup2 = (RadioGroup)findViewById(R.id.rgroup2);
		r2button1 = (RadioButton)findViewById(R.id.r2button1);
		r2button2 = (RadioButton)findViewById(R.id.r2button2);
		r2button3 = (RadioButton)findViewById(R.id.r2button3);
		secondbujubutton = (Button)findViewById(R.id.secondbujubutton);
		
		rgroup2.setOnCheckedChangeListener(new g2Listener());
		secondbujubutton.setOnClickListener(new g2sureListener());
		
	}
	class g2Listener implements android.widget.RadioGroup.OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup g2, int id) {
	       if(id == r2button1.getId())
	       {
	    	   string2 = "¼ôµ¶";
	       }
	       else if(id == r2button2.getId())
	       {
	    	   string2 = "Ê¯Í·";
	       }
	       else if(id == r2button3.getId())
	       {
	    	   string2 = "²¼";
	       }
		}

		}
	class g2sureListener implements OnClickListener{

		@Override
		public void onClick(View view) {
			Intent intent = new Intent();
			intent.setClass(SecondActivity.this, ThirdActivity.class);
			startActivity(intent);
			
		}
		
	}
	}
	


