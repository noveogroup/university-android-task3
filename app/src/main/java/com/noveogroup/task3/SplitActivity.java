package com.noveogroup.task3;

import android.os.Bundle;

public final class SplitActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
