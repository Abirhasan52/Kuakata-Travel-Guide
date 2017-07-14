package com.tourismcoachbd.kuakatatravelguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Developer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_developer);
		
		Button Call = (Button) findViewById(R.id.buttoncall_Dev);
	      Call.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall();
	         }
		  });
	         
	         Button Facebook=(Button) findViewById(R.id.buttonfb);
	         Facebook.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					String fb="https://web.facebook.com/mayn.rakib";
					
					Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(fb));
					startActivity(intent);
					
				}
			});
	         
	         
	         Button Message=(Button) findViewById(R.id.buttonMsg);
	         Message.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					String phoneNumber="+8801815911830";
					String message="";
					
					Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("sms:"+phoneNumber));
					
					intent.putExtra("sms_body", message);
					startActivity(intent);
				}
			});

	   }
	
	
	   protected void makeCall() {
	      Log.i("Make call", "");

	      Intent phoneIntent = new Intent(Intent.ACTION_CALL);
	      phoneIntent.setData(Uri.parse("tel:+88 01815911830"));

	      try {
	         startActivity(phoneIntent);
	         finish();
	         Log.i("Finished making a call...", "");
	      } catch (android.content.ActivityNotFoundException ex) {
	         Toast.makeText(Developer.this, 
	         "Call faild, please try again later.", Toast.LENGTH_SHORT).show();
	      }
	   }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.developer, menu);
		return false;
	}
}
