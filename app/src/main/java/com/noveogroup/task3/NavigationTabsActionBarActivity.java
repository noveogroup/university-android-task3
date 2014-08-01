package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.widget.Toast;

public class NavigationTabsActionBarActivity extends Task2ActionBarActivity implements ActionBar.TabListener {

	public static final String TAB_NUMBER_STRING = "TAB_NUMBER";
	private boolean isSelectable = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_action_bar);

		ActionBar actionBar = getSupportActionBar();
		String[] tabs = getResources().getStringArray(R.array.tabs_text);
		for (String tabText : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tabText).setTabListener(this));
		}
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		if (savedInstanceState != null) {
			int saved = savedInstanceState.getInt(TAB_NUMBER_STRING, 0);
			if (saved != actionBar.getSelectedNavigationIndex())
				actionBar.setSelectedNavigationItem(saved);
		}
		isSelectable = true;
	}

	@Override
	public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
		if (isSelectable)
			Toast.makeText(this, getString(R.string.tab_select_text, tab.getText()), Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
		//Nothing
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
		if (isSelectable)
			Toast.makeText(this, getString(R.string.tab_reselect_text, tab.getText()), Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt(TAB_NUMBER_STRING, getSupportActionBar().getSelectedNavigationIndex());
	}
}
