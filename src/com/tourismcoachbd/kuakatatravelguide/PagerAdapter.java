package com.tourismcoachbd.kuakatatravelguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
	

	public PagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		switch (arg0) {
		case 0:
			
			return new FragmentFirst();
			
       case 1:
			
			return new FragmentTwo();
			
       case 2:
			
			return new FragmentThree();
			
       case 3:
			
			return new FragmentFour();
			
       case 4:
			
			return new FragmentFive();
			
       case 5:
			
			return new FragmentEight();
			
			
       case 6:
			
			return new FragmentTen();
			
       case 7:
			
			return new FragmentFifteen();

		default:
			break;
		}
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 8;
	}

}
