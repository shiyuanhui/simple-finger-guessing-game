package com.shiyuanhui.wuliao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends Activity{
	private TextView tx1;
	private Button fanhui;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thirdactivity);
		tx1 = (TextView)findViewById(R.id.jieguo);
		fanhui = (Button)findViewById(R.id.fanhui);
		FirstActivity f1 = new FirstActivity();
		SecondActivity f2 = new SecondActivity();
		if(f1.string1 == f2.string2)
		{
			tx1.setText("��С�Ĵ�ƽ��");
		}
		else if(f1.string1 == "����" && f2.string2 == "ʯͷ")
		{
			tx1.setText("СèӮ��");
		}
		else if(f1.string1 == "����" && f2.string2 == "��")
		{
			tx1.setText("С��Ӯ��");
		}
		else if(f1.string1 == "ʯͷ" && f2.string2 == "����")
		{
			tx1.setText("С��Ӯ��");
		}
		else if(f1.string1 == "ʯͷ" && f2.string2 == "��")
		{
			tx1.setText("СèӮ��");
		}
		else if(f1.string1 == "��" && f2.string2 == "����")
		{
			tx1.setText("СèӮ��");
		}
		else if(f1.string1 == "��" && f2.string2 == "ʯͷ")
		{
			tx1.setText("С��Ӯ��");
		}
		fanhui.setOnClickListener(new g3sureListener());
	}
	class g3sureListener implements OnClickListener{

		@Override
		public void onClick(View view) {
			Intent intent = new Intent();
			intent.setClass(ThirdActivity.this, FirstActivity.class);
			startActivity(intent);
			
		}
	}		

}
