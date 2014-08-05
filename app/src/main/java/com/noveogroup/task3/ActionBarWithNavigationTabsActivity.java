package com.noveogroup.task3;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.noveogroup.task3.R;

public class ActionBarWithNavigationTabsActivity extends SimpleActionBarActivity implements ActionBar.TabListener {

    private static final String KEY_TAB_SELECTED = "TAB_SELECTED";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_with_navigation_tabs);
        getSupportActionBar().setTitle(R.string.app_name);
        getSupportActionBar().setNavigationMode(getSupportActionBar().NAVIGATION_MODE_TABS);

        String[] tabNames = getResources().getStringArray(R.array.tab_names);
        for (int i = 0; i < tabNames.length; i++) {
            ActionBar.Tab tab = getSupportActionBar().newTab();
            tab.setText(tabNames[i]);
            tab.setTabListener(this);
            getSupportActionBar().addTab(tab);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar_with_navigation_tabs, menu);
        return true;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Toast.makeText(this, getString(R.string.tab_selected, tab.getText().toString()), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Toast.makeText(this, getString(R.string.tab_unselected, tab.getText().toString()), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Toast.makeText(this, getString(R.string.tab_reselected, tab.getText().toString()), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_TAB_SELECTED, getSupportActionBar().getSelectedNavigationIndex());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        getSupportActionBar().setSelectedNavigationItem(savedInstanceState.getInt(KEY_TAB_SELECTED));
    }
}
