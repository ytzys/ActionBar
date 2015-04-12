package com.ytzys.actionbar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		text = (TextView) findViewById(R.id.text);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_open:
			openActivity();
			break;
		case R.id.action_search:
			text.setText("search clicked");
			break;
		case R.id.action_settings:
			text.setText("settings clicked");
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

	private void openActivity() {
		Intent intent = new Intent(this, SecondActivity.class);
		startActivity(intent);

	}

}
