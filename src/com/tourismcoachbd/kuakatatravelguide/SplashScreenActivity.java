package com.tourismcoachbd.kuakatatravelguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		
		Animation anim= AnimationUtils.loadAnimation(this, R.anim.move_up);
		ImageView imageView=(ImageView) findViewById(R.id.imageView_title);
		imageView.setAnimation(anim);
		
		Handler handler=new Handler();
		handler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
           startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
           finish();
				
			}
		}, 3000);
	}

}
