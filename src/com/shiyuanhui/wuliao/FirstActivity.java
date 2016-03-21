package com.shiyuanhui.wuliao;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FirstActivity extends Activity{
	private Button firstbujubutton;
	private RadioGroup rgroup;
	private RadioButton rbutton1;
	private RadioButton rbutton2;
	private RadioButton rbutton3;
	public static String string1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.firstbuju);
		firstbujubutton = (Button)findViewById(R.id.firstbujubutton);
		rgroup = (RadioGroup)findViewById(R.id.rgroup);
		rbutton1 = (RadioButton)findViewById(R.id.rbutton1);
		rbutton2 = (RadioButton)findViewById(R.id.rbutton2);
		rbutton3 = (RadioButton)findViewById(R.id.rbutton3);
		
		rgroup.setOnCheckedChangeListener(new g1Listener());
		firstbujubutton.setOnClickListener(new g1sureListener());
		
	}
	class g1Listener implements android.widget.RadioGroup.OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup g1, int id) {
	       if(id == rbutton1.getId())
	       {
	    	   string1 = "¼ôµ¶";
	       }
	       else if(id == rbutton2.getId())
	       {
	    	   string1 = "Ê¯Í·";
	       }
	       else if(id == rbutton3.getId())
	       {
	    	   string1 = "²¼";
	       }
		}

		}
	class g1sureListener implements OnClickListener{

		@Override
		public void onClick(View view) {
			Intent in = new Intent(FirstActivity.this, SecondActivity.class);
			startActivity(in);
			
		}
		
	}
	

}
