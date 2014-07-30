package com.noveogroup.task3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
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

    public void startSimpleActivity(View view) {
        Intent intent = new Intent(this, SimpleActivity.class);
        startActivity(intent);
    }

    public void startUpActivity(View view) {
        Intent intent = new Intent(this, UpActivity.class);
        startActivity(intent);
    }

    public void startSplitActivity(View view) {
        Intent intent = new Intent(this, SplitActivity.class);
        startActivity(intent);
    }
}
