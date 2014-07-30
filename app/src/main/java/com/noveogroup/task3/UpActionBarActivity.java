package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class UpActionBarActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_action_bar);
		getSupportActionBar().show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
		System.out.println(123);
		getMenuInflater().inflate(R.menu.simple_action_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
		switch (id){
			case R.id.action_go:
				Toast.makeText(this, getString(R.string.unavailable, getString(R.string.action_go)), Toast.LENGTH_SHORT).show();
				break;
			case R.id.action_search:
				Toast.makeText(this, getString(R.string.unavailable, getString(R.string.action_search)), Toast.LENGTH_SHORT).show();
				break;
			case R.id.action_clear:
				Toast.makeText(this, getString(R.string.unavailable, getString(R.string.action_clear)), Toast.LENGTH_SHORT).show();
				break;
			case R.id.action_settings:
				Toast.makeText(this, getString(R.string.unavailable, getString(R.string.action_settings)), Toast.LENGTH_SHORT).show();
				break;
			default:
				return super.onOptionsItemSelected(item);
		}
        return true;
    }
}
