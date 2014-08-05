package com.noveogroup.task3;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.noveogroup.task3.R;

public class ActionBarWithNavigationListActivity extends SimpleActionBarActivity implements ActionBar.OnNavigationListener {

    private static final String KEY_ITEM_SELECTED = "ITEM_SELECTED";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_with_navigation_list);
        getSupportActionBar().setTitle(R.string.app_name);

        String[] data = getResources().getStringArray(R.array.list_names);
        getSupportActionBar().setNavigationMode(getSupportActionBar().NAVIGATION_MODE_LIST);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        getSupportActionBar().setListNavigationCallbacks(adapter, this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar_with_navigation_list, menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        Toast.makeText(this, getString(R.string.item_was_clicked, i + 1), Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_ITEM_SELECTED, getSupportActionBar().getSelectedNavigationIndex());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        getSupportActionBar().setSelectedNavigationItem(savedInstanceState.getInt(KEY_ITEM_SELECTED));
    }
}
