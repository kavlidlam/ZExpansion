package com.example.zexpansion;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Activity {
	
	int multiplier;
	Button send, sendcst;
	TextView display;
	EditText textval;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textval = (EditText) findViewById(R.id.edit_text);
		send = (Button) findViewById(R.id.button_send);
		
		
		send.setOnClickListener(new View.OnClickListener() {
		    
			@Override
			public void onClick(View v) {
		        // Do something in response to button click
				
				String str_val = textval.getText().toString();
				float val = Float.valueOf(str_val);
				
				Intent intent = new Intent(v.getContext(), GL1Activity.class);
				intent.putExtra("val", val);
				startActivityForResult(intent, 0);
		    }
		});
		
		send.setOnClickListener(new View.OnClickListener() {
		    
			@Override
			public void onClick(View v) {
		        // Do something in response to button click
				
				String str_val = textval.getText().toString();
				float val = Float.valueOf(str_val);
				
				Intent intent = new Intent(v.getContext(), GL1Activity.class);
				intent.putExtra("val", val);
				startActivityForResult(intent, 0);
		    }
		});
		
		
		
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
