package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class NavigationListActionBarActivity extends Task2ActionBarActivity implements ActionBar.OnNavigationListener {

	private static final String LIST_NUMBER_STRING = "LIST_NUMBER";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_action_bar);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
				getResources().getStringArray(R.array.tabs_text)
		);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		actionBar.setListNavigationCallbacks(adapter, this);
		if (savedInstanceState != null) {
			int saved = savedInstanceState.getInt(LIST_NUMBER_STRING, 0);
			if (saved != actionBar.getSelectedNavigationIndex())
				actionBar.setSelectedNavigationItem(saved);
		}

	}

	@Override
	public boolean onNavigationItemSelected(int index, long itemId) {
		Toast.makeText(this, getString(R.string.nav_item_selected, index), Toast.LENGTH_SHORT).show();
		return true;
	}


	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt(LIST_NUMBER_STRING, getSupportActionBar().getSelectedNavigationIndex());
	}
}
