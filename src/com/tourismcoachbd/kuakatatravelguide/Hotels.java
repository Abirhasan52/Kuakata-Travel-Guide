package com.tourismcoachbd.kuakatatravelguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Hotels extends Activity implements OnClickListener {
	
	Button nilanjona;
	Button skyPalace;
	Button kuakataInn;
	Button mohona;
	Button goldenPalace;
	Button alHera;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hotels);
		
		nilanjona=(Button)findViewById(R.id.button1);
		skyPalace=(Button)findViewById(R.id.button2);
		kuakataInn=(Button)findViewById(R.id.button3);
		mohona=(Button)findViewById(R.id.button4);
		goldenPalace=(Button)findViewById(R.id.button5);
		alHera=(Button)findViewById(R.id.button6);
		
		nilanjona.setOnClickListener(this);
		skyPalace.setOnClickListener(this);
		kuakataInn.setOnClickListener(this);
		mohona.setOnClickListener(this);
		goldenPalace.setOnClickListener(this);
		alHera.setOnClickListener(this);
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
			Intent i=new Intent(this,Hotel_nilanjona.class);
			startActivity(i);
			break;
			
			case R.id.button2:
				Intent j=new Intent(this,Hotel_skyPalace.class);
				startActivity(j);
				break;
				
				
				case R.id.button3:
					Intent k=new Intent(this,Hotel_kuakataInn.class);
					startActivity(k);
					break;
					
					
					case R.id.button4:
						Intent l=new Intent(this,Hotel_mohona.class);
						startActivity(l);
						break;
						
					case R.id.button5:
						Intent m=new Intent(this,Hotel_goldePalace.class);
						startActivity(m);
						break;
						
					case R.id.button6:
						Intent n=new Intent(this,Hotel_al_hera.class);
						startActivity(n);
						break;

		default:
			break;
		}
	}
}