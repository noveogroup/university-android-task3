package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

public class ActionBarWithTabsActivity extends ActionBarActivity {

    private int currentTab = 0;
    private static final String STATE_CURRENT_TAB = "STATE_CURRENT_TAB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            currentTab = savedInstanceState.getInt(STATE_CURRENT_TAB);
        }

        setContentView(R.layout.activity_root);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(false);

        createTab(actionBar, getResources().getString(R.string.actionbar_cheese), 0);
        createTab(actionBar, getResources().getString(R.string.actionbar_tomato), 1);

        actionBar.setSelectedNavigationItem(currentTab);
    }

    private void createTab(ActionBar actionBar, String text, int position) {
        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
                Toast toast = Toast.makeText(getApplicationContext(), tab.getText(), Toast.LENGTH_SHORT);
                toast.show();
                currentTab = tab.getPosition();
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

            }
        };

        ActionBar.Tab tab = actionBar.newTab()
                .setText(text)
                .setTabListener(tabListener);
        actionBar.addTab(tab, position, false);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_CURRENT_TAB, currentTab);
        super.onSaveInstanceState(savedInstanceState);
    }

}
