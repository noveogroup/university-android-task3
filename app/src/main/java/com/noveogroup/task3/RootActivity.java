package com.noveogroup.task3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class RootActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
    }

    public void dummy(View view) {
        Toast.makeText(this, R.string.dragon, Toast.LENGTH_SHORT).show();
    }
}
