package com.noveogroup.task3;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.noveogroup.task3.R;

public class ActionBarWithNavigationTabs extends ActionBarActivity implements ActionBar.TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_with_navigation_tabs);
        getSupportActionBar().setTitle(R.string.app_name);
        getSupportActionBar().setNavigationMode(getSupportActionBar().NAVIGATION_MODE_TABS);


        ActionBar.Tab tab1 = getSupportActionBar().newTab();
        tab1.setText("Tab1");
        tab1.setTabListener(this);
        getSupportActionBar().addTab(tab1);
        ActionBar.Tab tab2 = getSupportActionBar().newTab();
        tab2.setText("Tab2");
        tab2.setTabListener(this);
        getSupportActionBar().addTab(tab2);
        ActionBar.Tab tab3 = getSupportActionBar().newTab();
        tab3.setText("Tab3");
        tab3.setTabListener(this);
        getSupportActionBar().addTab(tab3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar_with_navigation_tabs, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_refresh:
                Toast.makeText(this, "Refresh button", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_search:
                Toast.makeText(this, "Search button", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_share:
                Toast.makeText(this, "Share button", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(this, "Settings button", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        if (tab.getText().toString() == "Tab1") {
            Toast.makeText(this, "Tab1 selected", Toast.LENGTH_SHORT).show();
        }
        else if (tab.getText().toString() == "Tab2") {
            Toast.makeText(this, "Tab2 selected", Toast.LENGTH_SHORT).show();
        }
        else if (tab.getText().toString() == "Tab3") {
            Toast.makeText(this, "Tab3 selected", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        if (tab.getText().toString() == "Tab1") {
            Toast.makeText(this, "Tab1 unselected", Toast.LENGTH_SHORT).show();
        }
        else if (tab.getText().toString() == "Tab2") {
            Toast.makeText(this, "Tab2 unselected", Toast.LENGTH_SHORT).show();
        }
        else if (tab.getText().toString() == "Tab3") {
            Toast.makeText(this, "Tab3 unselected", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        if (tab.getText().toString() == "Tab1") {
            Toast.makeText(this, "Tab1 reselected", Toast.LENGTH_SHORT).show();
        }
        else if (tab.getText().toString() == "Tab2") {
            Toast.makeText(this, "Tab2 reselected", Toast.LENGTH_SHORT).show();
        }
        else if (tab.getText().toString() == "Tab3") {
            Toast.makeText(this, "Tab3 reselected", Toast.LENGTH_SHORT).show();
        }
    }
}
