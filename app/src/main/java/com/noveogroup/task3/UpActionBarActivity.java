package com.noveogroup.task3;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class UpActionBarActivity extends Task2ActionBarActivity {

	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) return false;
		Toast.makeText(this, getString(R.string.unavailable, item.getTitle()), Toast.LENGTH_SHORT).show();
		return true;
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_action_bar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().show();
    }

}
