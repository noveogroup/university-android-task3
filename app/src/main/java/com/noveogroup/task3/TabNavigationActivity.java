package com.noveogroup.task3;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.widget.TabHost;
import android.widget.Toast;

public class TabNavigationActivity extends AbsMenuActivity implements ActionBar.TabListener {

    private static final int TAB_COUNT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar ab = getSupportActionBar();
        Resources res = getResources();
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        for (int i = 1; i <= TAB_COUNT; i++) {
            ActionBar.Tab tab = ab.newTab();
            tab.setText(res.getString(R.string.tab_title_format, i));
            tab.setTag(i);
            tab.setTabListener(this);
            ab.addTab(tab);
        }
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Toast.makeText(
                this,
                getResources().getString(R.string.tab_selected_format, (Integer)tab.getTag()),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) { }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) { }
}
