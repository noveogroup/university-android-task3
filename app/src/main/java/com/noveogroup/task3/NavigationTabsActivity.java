package com.noveogroup.task3;

import android.content.res.Resources;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class NavigationTabsActivity extends ActionBarActivity implements ActionBar.TabListener {
    private ActionBar actionBar;
    private TextView info;
    public static final String KEY_TAB_POSITION = "com.noveogroup.task3.tab_position";

    private int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_tabs);
        info = (TextView) findViewById(R.id.tabs_info);
        actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        createTabs();
    }

    private void createTabs() {
        Resources res = getResources();
        String[] titles = res.getStringArray(R.array.categories);

        for(String str : titles) {
            ActionBar.Tab tab = actionBar.newTab();
            tab.setText(str);
            tab.setTabListener(this);
            actionBar.addTab(tab);
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        position = savedInstanceState.getInt(KEY_TAB_POSITION);
        actionBar.setSelectedNavigationItem(position);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(KEY_TAB_POSITION, actionBar.getSelectedNavigationIndex());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation_tabs, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean ret;
        switch (item.getItemId()) {
            case R.id.hello_item:
                ret = true;
                Toast.makeText(this, R.string.toast_text_hello, Toast.LENGTH_LONG).show();
                break;
            case  R.id.world_item:
                ret = true;
                Toast.makeText(this, R.string.toast_text_world,Toast.LENGTH_LONG).show();
                break;
            case R.id.about_item:
                ret = true;
                Toast.makeText(this, R.string.toast_text_about,Toast.LENGTH_LONG).show();
                break;
            default:
                ret = super.onOptionsItemSelected(item);
        }
        return ret;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        info.setText(tab.getText());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        String toastText = getString(R.string.toast_text_tab_unselected, tab.getText().toString());
        Toast.makeText(this, toastText,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        String toastText = getString(R.string.toast_text_tab_reselected, tab.getText());
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
}
