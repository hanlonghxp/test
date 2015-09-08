package com.example.fileactivity;

import com.example.fileactivity.services.FileService;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	private FileService fs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		fs = new FileService(this);
		
	}
	public void onClick(View v){
		switch (v.getId()) {
		case R.id.btn:
			fs.save();
			break;
		case R.id.btn2:
			
			break;
		default:
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
