package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;

public class CustomViewActivity extends AbsMenuActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View customView  = new View(this);
        customView.setBackgroundColor(getResources().getColor(R.color.custom_view_background));
        ActionBar ab = getSupportActionBar();
        ab.setCustomView(customView);
        ab.setDisplayShowTitleEnabled(false);
        ab.setDisplayShowCustomEnabled(true);
    }
}
