package com.example.emergency;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class M1 extends Activity {
	Button fire,police,drugs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m1);
		fire=(Button)findViewById(R.id.fire);
		police=(Button)findViewById(R.id.police);
		drugs=(Button)findViewById(R.id.drugs);
		fire.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(M1.this,M2.class);
				startActivity(i1);
				
			}
		});
		police.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i2=new Intent(M1.this,M3.class);
				startActivity(i2);
				
			}
		});
		drugs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i3=new Intent(M1.this,M4.class);
				startActivity(i3);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.m1, menu);
		return true;
	}

}
