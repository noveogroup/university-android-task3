package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class ActionBarWithNavigationListActivity extends ActionBarActivity {

    private int currentTab = 0;
    private static final String STATE_CURRENT_TAB = "STATE_CURRENT_TAB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            currentTab = savedInstanceState.getInt(STATE_CURRENT_TAB);
        }

        setContentView(R.layout.activity_root);

        SpinnerAdapter mSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.action_list, android.R.layout.simple_spinner_dropdown_item);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        ActionBar.OnNavigationListener mOnNavigationListener = new ActionBar.OnNavigationListener() {
            // Get the same strings provided for the drop-down's ArrayAdapter
            String[] strings = getResources().getStringArray(R.array.action_list);

            @Override
            public boolean onNavigationItemSelected(int position, long itemId) {

                Toast toast = Toast.makeText(getApplicationContext(), strings[position], Toast.LENGTH_SHORT);
                toast.show();
                currentTab = position;
                return true;
            }
        };

        actionBar.setListNavigationCallbacks(mSpinnerAdapter, mOnNavigationListener);
        actionBar.setSelectedNavigationItem(currentTab);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_CURRENT_TAB, currentTab);
        super.onSaveInstanceState(savedInstanceState);
    }
}
