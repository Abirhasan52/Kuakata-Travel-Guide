package com.tourismcoachbd.kuakatatravelguide;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class AboutKuakata extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_kuakata);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about_kuakata, menu);
		return false;
	}
}
