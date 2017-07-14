package com.tourismcoachbd.kuakatatravelguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Spots extends Activity implements OnClickListener {
	
	Button fatratChar;
	Button reservedForest;
	Button buddistTemple;
	Button jhauBon;
	Button shutkiPolli;
	Button ecoPark;
	Button leburChar;
	Button narikelBagan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spots);
		
		fatratChar=(Button)findViewById(R.id.button1);
		reservedForest=(Button)findViewById(R.id.button2);
		buddistTemple=(Button)findViewById(R.id.button3);
		jhauBon=(Button)findViewById(R.id.button4);
		shutkiPolli=(Button)findViewById(R.id.button5);
		ecoPark=(Button)findViewById(R.id.button6);
		leburChar=(Button)findViewById(R.id.button7);
		narikelBagan=(Button)findViewById(R.id.button8);
		
		fatratChar.setOnClickListener(this);
		reservedForest.setOnClickListener(this);
		buddistTemple.setOnClickListener(this);
		jhauBon.setOnClickListener(this);
		shutkiPolli.setOnClickListener(this);
		ecoPark.setOnClickListener(this);
		leburChar.setOnClickListener(this);
		narikelBagan.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.spots, menu);
		return false;
	}
	
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			Intent i=new Intent(this,FatrarChar.class);
			startActivity(i);
			break;
			
			case R.id.button2:
				Intent j=new Intent(this,ReservedForest.class);
				startActivity(j);
				break;
				
				
				case R.id.button3:
					Intent k=new Intent(this,BuddistTemple.class);
					startActivity(k);
					break;
					
					
					case R.id.button4:
						Intent l=new Intent(this,JhauBon.class);
						startActivity(l);
						break;
						
					case R.id.button5:
						Intent m=new Intent(this,ShutkiPolli.class);
						startActivity(m);
						break;
						
					case R.id.button6:
						Intent n=new Intent(this,EcoPark.class);
						startActivity(n);
						break;
						
					case R.id.button7:
						Intent o=new Intent(this,Lebur_char.class);
						startActivity(o);
						break;
						
					case R.id.button8:
						Intent p=new Intent(this,Narikel_bagan.class);
						startActivity(p);
						break;

		default:
			break;
		}
	}
}