package com.tourismcoachbd.kuakatatravelguide;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class Google_map extends FragmentActivity {
	ViewPager viewpager2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_google_map);
		
		viewpager2=(ViewPager)findViewById(R.id.pager2);
		PageAdapter2 padapter2=new PageAdapter2(getSupportFragmentManager());
		viewpager2.setAdapter(padapter2);
	}
}
