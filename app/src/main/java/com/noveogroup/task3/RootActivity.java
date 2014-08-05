package com.noveogroup.task3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RootActivity extends /*ActionBarActivity*/ Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);

       Button simpleActionBar = (Button)findViewById(R.id.simple_action_bar);
       Button simpleActionBarWithUpButton = (Button)findViewById(R.id.simple_action_bar_up_button);
       Button splitActionBar = (Button)findViewById(R.id.split_action_bar);
       Button actionBarWithNavigationTabs = (Button)findViewById(R.id.action_bar_with_navigation_tabs);
       Button actionBarWithNavigationList = (Button)findViewById(R.id.action_bar_with_navigation_list);
       Button actionBarWithCustomView = (Button)findViewById(R.id.action_bar_with_custom_view);
       Button actionBarWithCustomTheme = (Button)findViewById(R.id.action_bar_with_custom_theme);
       Button actionBarWithActionView = (Button)findViewById(R.id.action_bar_with_action_view);

        simpleActionBar.setOnClickListener(this);
        simpleActionBarWithUpButton.setOnClickListener(this);
        splitActionBar.setOnClickListener(this);
        actionBarWithNavigationTabs.setOnClickListener(this);
        actionBarWithNavigationList.setOnClickListener(this);
        actionBarWithCustomView.setOnClickListener(this);
        actionBarWithCustomTheme.setOnClickListener(this);
        actionBarWithActionView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.simple_action_bar:
                startActivity(new Intent(this, SimpleActionBarActivity.class));
                break;
            case R.id.simple_action_bar_up_button:
                startActivity(new Intent(this, ActionBarWithUpButtonActivity.class));
                break;
            case R.id.split_action_bar:
                startActivity(new Intent(this, SplitActionBarActivity.class));
                break;
            case R.id.action_bar_with_navigation_tabs:
                startActivity(new Intent(this, ActionBarWithNavigationTabsActivity.class));
                break;
            case R.id.action_bar_with_navigation_list:
                startActivity(new Intent(this, ActionBarWithNavigationListActivity.class));
                break;
            case R.id.action_bar_with_custom_view:
                startActivity(new Intent(this, ActionBarWithCustomViewActivity.class));
                break;
            case R.id.action_bar_with_custom_theme:
                startActivity(new Intent(this, ActionBarWithCustomThemeActivity.class));
                break;
            case R.id.action_bar_with_action_view:
                startActivity(new Intent(this, ActionBarWithActionViewActivity.class));
                break;
            default:
                break;
        }
    }
}
