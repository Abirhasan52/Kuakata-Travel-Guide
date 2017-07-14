package com.tourismcoachbd.kuakatatravelguide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class EcoPark extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eco_park);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eco_park, menu);
		return false;
	}

}
