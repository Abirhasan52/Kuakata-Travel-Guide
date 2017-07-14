package com.tourismcoachbd.kuakatatravelguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Resorts extends Activity implements OnClickListener {
	
	Button sagorKonna;
	Button blueOcean;
	Button sweetHome;
	Button guestHouse;
	Button somudraBilash;
	Button blueOcean_real;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resorts);
		
		sagorKonna=(Button)findViewById(R.id.button1);
		blueOcean=(Button)findViewById(R.id.button2);
		sweetHome=(Button)findViewById(R.id.button3);
		guestHouse=(Button)findViewById(R.id.button4);
		somudraBilash=(Button)findViewById(R.id.button5);
		blueOcean_real=(Button)findViewById(R.id.button6);
		sagorKonna.setOnClickListener(this);
		blueOcean.setOnClickListener(this);
		sweetHome.setOnClickListener(this);
		guestHouse.setOnClickListener(this);
		somudraBilash.setOnClickListener(this);
		blueOcean_real.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hotels, menu);
		return false;
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			Intent i=new Intent(this,Resort_Sagorkonna.class);
			startActivity(i);
			break;
			
			case R.id.button2:
				Intent j=new Intent(this,Resort_blueocean.class);
				startActivity(j);
				break;
				
				
				case R.id.button3:
					Intent k=new Intent(this,Resort_sweetmate.class);
					startActivity(k);
					break;
					
					
					case R.id.button4:
						Intent l=new Intent(this,Resort_guesthouse.class);
						startActivity(l);
						break;
						
					case R.id.button5:
						Intent m=new Intent(this,Resort_somudrabilash.class);
						startActivity(m);
						break;
						
					case R.id.button6:
						Intent n=new Intent(this,Resorts_Blue_ocean.class);
						startActivity(n);
						break;

		default:
			break;
		}
	}
}