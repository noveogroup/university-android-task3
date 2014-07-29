package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

public class ActionBarWithTabs extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);

        // setup action bar for tabs
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(false);

        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
            @Override
            public void onTabSelected(Tab tab, FragmentTransaction fragmentTransaction) {
                Toast toast = Toast.makeText(getApplicationContext(), tab.getText(), Toast.LENGTH_SHORT);
                toast.show();
            }

            @Override
            public void onTabUnselected(Tab tab, FragmentTransaction fragmentTransaction) {

            }

            @Override
            public void onTabReselected(Tab tab, FragmentTransaction fragmentTransaction) {

            }
        };

        Tab tab = actionBar.newTab()
                .setText(R.string.actionbar_cheese)
                .setTabListener(tabListener);
        actionBar.addTab(tab);

        tab = actionBar.newTab()
                .setText(R.string.actionbar_tomato)
                .setTabListener(tabListener);
        actionBar.addTab(tab);
    }
}
