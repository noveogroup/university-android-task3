package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.widget.Toast;

public class NavigationTabsActionBarActivity extends Task2ActionBarActivity implements ActionBar.TabListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_action_bar);

		ActionBar actionBar = getSupportActionBar();
		actionBar.addTab(actionBar.newTab().setText(getString(R.string.tab1_text)).setTabListener(this));
		actionBar.addTab(actionBar.newTab().setText(getString(R.string.tab2_text)).setTabListener(this));
		actionBar.addTab(actionBar.newTab().setText(getString(R.string.tab3_text)).setTabListener(this));
		actionBar.addTab(actionBar.newTab().setText(getString(R.string.tab4_text)).setTabListener(this));
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
	}

	@Override
	public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
		Toast.makeText(this, getString(R.string.tab_select_text, tab.getText()), Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
		//Nothing
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
		Toast.makeText(this, getString(R.string.tab_reselect_text, tab.getText()), Toast.LENGTH_LONG).show();
	}
}
