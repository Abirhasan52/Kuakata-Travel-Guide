package com.tourismcoachbd.kuakatatravelguide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FatrarChar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fatrar_char);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fatrar_char, menu);
		return false;
	}
}
