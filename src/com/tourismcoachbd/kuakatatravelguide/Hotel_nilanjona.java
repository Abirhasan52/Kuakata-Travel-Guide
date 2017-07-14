package com.tourismcoachbd.kuakatatravelguide;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Hotel_nilanjona extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hotel_nilanjona);
		
		Button Call = (Button) findViewById(R.id.buttoncall);
	      Call.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall();
	      }
	   });

	   }
	   protected void makeCall() {
	      Log.i("Make call", "");

	      Intent phoneIntent = new Intent(Intent.ACTION_CALL);
	      phoneIntent.setData(Uri.parse("tel:+88 01856699911"));

	      try {
	         startActivity(phoneIntent);
	         finish();
	         Log.i("Finished making a call...", "");
	      } catch (android.content.ActivityNotFoundException ex) {
	         Toast.makeText(Hotel_nilanjona.this, 
	         "Call faild, please try again later.", Toast.LENGTH_SHORT).show();
	      }
	   }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hotel_nilanjona, menu);
		return false;
	}
}
