package com.example.emergency;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class M3 extends Activity {
	TextView user,type,loc,land;
	EditText e1,e2,e3,e4;
	Button post;
	String s1,s2,s3,s4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m2);
		user=(TextView)findViewById(R.id.textView2);
		type=(TextView)findViewById(R.id.textView3);
		loc=(TextView)findViewById(R.id.textView4);
		land=(TextView)findViewById(R.id.textView5);
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		e3=(EditText)findViewById(R.id.editText3);
		e4=(EditText)findViewById(R.id.editText4);
		post=(Button)findViewById(R.id.button1);
		post.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				s1=e1.getText().toString();
				s2=e2.getText().toString();
				s3=e3.getText().toString();
				s4=e4.getText().toString();
				Intent s=new Intent(Intent.ACTION_SEND);
				s.setType("message/rfc822");
				s.putExtra(Intent.EXTRA_EMAIL,new String[]{"uniqsathish83@gmail.com"});
				s.putExtra(Intent.EXTRA_SUBJECT,"WELCOME TO THE APP");
				s.putExtra(Intent.EXTRA_TEXT,"User :"+ s1 +"\n"+"Type :"+ s2+"\n"+"Location :" + s3+"\n"+"Landmark :"+ s4);
				startActivity(Intent.createChooser(s,"sending mail..."));
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.m2, menu);
		return true;
	}

}
