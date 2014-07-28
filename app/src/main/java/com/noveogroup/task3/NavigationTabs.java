package com.noveogroup.task3;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class NavigationTabs extends ActionBarActivity implements ActionBar.TabListener {
    private ActionBar actionBar;
    private TextView info;

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
        ActionBar.Tab videoTab = actionBar.newTab();
        videoTab.setText(R.string.video);
        videoTab.setTabListener(this);
        actionBar.addTab(videoTab);

        ActionBar.Tab musicTab = actionBar.newTab();
        musicTab.setText(R.string.music);
        musicTab.setTabListener(this);
        actionBar.addTab(musicTab);

        ActionBar.Tab imagesTab = actionBar.newTab();
        imagesTab.setText(R.string.images);
        imagesTab.setTabListener(this);
        actionBar.addTab(imagesTab);
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
                Log.d("Simple", "hello_item");
                ret = true;
                Toast.makeText(this, "This is Hello item", Toast.LENGTH_LONG).show();
                break;
            case  R.id.world_item:
                Log.d("Simple","world_item");
                ret = true;
                Toast.makeText(this, "This is World item",Toast.LENGTH_LONG).show();
                break;
            case R.id.about_item:
                Log.d("Simple","about_item");
                ret = true;
                Toast.makeText(this, "This is About item",Toast.LENGTH_LONG).show();
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
        Toast.makeText(this,"Out in with tab " + tab.getText(),Toast.LENGTH_SHORT);
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Toast.makeText(this,"Tab " + tab.getText() + " selected again",Toast.LENGTH_SHORT);
    }
}
