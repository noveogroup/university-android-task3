package com.noveogroup.task3;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.widget.TextView;

public final class ViewActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank_layout);

        TextView textView = new TextView(this);
        textView.setHint(getString(R.string.custom_text));
        ActionBar actionBar = getSupportActionBar();
        actionBar.setCustomView(textView);
        actionBar.setDisplayShowCustomEnabled(true);
    }
}
