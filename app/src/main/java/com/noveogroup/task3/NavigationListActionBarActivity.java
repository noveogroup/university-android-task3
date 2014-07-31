package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class NavigationListActionBarActivity extends Task2ActionBarActivity implements ActionBar.OnNavigationListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_action_bar);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
				new String[]{
						getString(R.string.tab1_text),
						getString(R.string.tab2_text),
						getString(R.string.tab3_text),
						getString(R.string.tab4_text),
				}
		);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		actionBar.setListNavigationCallbacks(adapter, this);
	}

	@Override
	public boolean onNavigationItemSelected(int index, long itemId) {
		Toast.makeText(this, getString(R.string.nav_item_selected, index), Toast.LENGTH_SHORT).show();
		return true;
	}

}
