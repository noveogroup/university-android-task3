package com.noveogroup.task3;

import android.os.Bundle;
import android.view.Menu;

public class UpActionBarActivity extends Task2ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_action_bar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().show();
    }

}
