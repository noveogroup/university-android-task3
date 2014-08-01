package com.noveogroup.task3;

import android.os.Bundle;

public final class UpActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank_layout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
