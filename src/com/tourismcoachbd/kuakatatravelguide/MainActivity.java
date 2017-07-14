package com.tourismcoachbd.kuakatatravelguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	
	Button kuakata;
	Button spots;
	Button hotels;
	Button resorts;
	Button gallery;
	Button map;
	Button user;
	Button developer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		kuakata=(Button)findViewById(R.id.button1);
		spots=(Button)findViewById(R.id.button2);
		hotels=(Button)findViewById(R.id.button3);
		resorts=(Button)findViewById(R.id.button4);
		gallery=(Button)findViewById(R.id.button5);
		map=(Button)findViewById(R.id.button6);
		user=(Button)findViewById(R.id.button7);
		developer=(Button)findViewById(R.id.button8);
		
		kuakata.setOnClickListener(this);
		spots.setOnClickListener(this);
		hotels.setOnClickListener(this);
		resorts.setOnClickListener(this);
		gallery.setOnClickListener(this);
		map.setOnClickListener(this);
		user.setOnClickListener(this);
		developer.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		return false;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			Intent i=new Intent(this,AboutKuakata.class);
			startActivity(i);
			break;
			
			case R.id.button2:
				Intent j=new Intent(this,Spots.class);
				startActivity(j);
				break;
				
				
				case R.id.button3:
					Intent k=new Intent(this,Hotels.class);
					startActivity(k);
					break;
					
					
					case R.id.button4:
						Intent l=new Intent(this,Resorts.class);
						startActivity(l);
						break;
						
					case R.id.button5:
						Intent p=new Intent(this,Image_gallery.class);
						startActivity(p);
						Toast.makeText(getApplicationContext(), "Please Slide the Image for next Image",
								Toast.LENGTH_LONG).show();
						break;
						
					case R.id.button6:
						Intent m=new Intent(this,Google_map.class);
						startActivity(m);
						Toast.makeText(getApplicationContext(), "Please Slide the Map for next Map",
								Toast.LENGTH_LONG).show();
						break;
						
					case R.id.button7:
						Intent n=new Intent(this,User_info.class);
						startActivity(n);
						break;
						
					case R.id.button8:
						Intent o=new Intent(this,Developer.class);
						startActivity(o);
						break;

		default:
			break;
		}
	}
}
