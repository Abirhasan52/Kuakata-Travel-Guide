package com.tourismcoachbd.kuakatatravelguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter2 extends FragmentPagerAdapter {
	

	public PageAdapter2(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		switch (arg0) {
		case 0:
			
			return new Frag_Map_One();
			
       case 1:
			
			return new Frag_Two_Map();
			
       case 2:
			
			return new Frag_Map_Three();
			
       case 3:
			
			return new Frag_Map_Four();

		default:
			break;
		}
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 4;
	}

}
