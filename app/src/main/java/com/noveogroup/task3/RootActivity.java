package com.noveogroup.task3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RootActivity extends ActionBarActivity {
    private Button simpleButton;
    private Button simpleUpButton;
    private Button splitButton;
    private Button navigationTabsButton;
    private Button navigationListButton;
    private Button customViewButton;
    private Button customThemeButton;
    private Button actionViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        init();
        setListeners();
    }

    private void init() {
        simpleButton = (Button) findViewById(R.id.simple_button);
        simpleUpButton = (Button) findViewById(R.id.simple_up_button);
        splitButton = (Button) findViewById(R.id.split_button);
        navigationTabsButton = (Button) findViewById(R.id.navigation_tabs_button);
        navigationListButton = (Button) findViewById(R.id.navigation_list_button);
        customViewButton = (Button) findViewById(R.id.custom_view_button);
        customThemeButton = (Button) findViewById(R.id.custom_theme_button);
        actionViewButton = (Button) findViewById(R.id.action_view_button);
    }

    private void setListeners() {
        simpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RootActivity.this, SimpleActionBar.class));
            }
        });
        simpleUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RootActivity.this, SimpleUpBar.class));
            }
        });
        splitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RootActivity.this, SplitActionBar.class));
            }
        });
        navigationTabsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RootActivity.this, NavigationTabs.class));
            }
        });
        navigationListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RootActivity.this, NavigationList.class));
            }
        });
        customViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RootActivity.this, CustomView.class));
            }
        });
        customThemeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RootActivity.this, CustomTheme.class));
            }
        });
        actionViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RootActivity.this, ActionView.class));
            }
        });
    }
}
