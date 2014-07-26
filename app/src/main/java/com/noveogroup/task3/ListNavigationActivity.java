package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class ListNavigationActivity extends AbsMenuActivity
        implements ActionBar.OnNavigationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayShowTitleEnabled(false);
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                getResources().getStringArray(R.array.list_items)
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ab.setListNavigationCallbacks(adapter, this);
    }

    @Override
    public boolean onNavigationItemSelected(int pos, long id) {
        Toast.makeText(
                this,
                getResources().getString(R.string.list_item_selected_format, pos),
                Toast.LENGTH_SHORT).show();
        return true;
    }

}
