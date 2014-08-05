package com.noveogroup.task3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.noveogroup.task3.R;

public class SplitActionBarActivity extends SimpleActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split_action_bar);
        getSupportActionBar().setTitle(R.string.app_name);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.split_action_bar, menu);
        return true;
    }
}
