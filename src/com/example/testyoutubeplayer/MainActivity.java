package com.example.testyoutubeplayer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;

import com.keyes.youtube.OpenYouTubePlayerActivity;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Intent lVideoIntent = new Intent(null, Uri.parse("ytv://wcPuC5nVGTM"), MainActivity.this, OpenYouTubePlayerActivity.class);
		startActivity(lVideoIntent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
