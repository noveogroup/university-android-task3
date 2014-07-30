package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public final class UpActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
