package com.noveogroup.task3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class RootActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root_layout);
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

    public void startTabsActivity(View view) {
        Intent intent = new Intent(this, TabsActivity.class);
        startActivity(intent);
    }

    public void startListActivity(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    public void startViewActivity(View view) {
        Intent intent = new Intent(this, ViewActivity.class);
        startActivity(intent);
    }

    public void startThemedActivity(View view) {
        Intent intent = new Intent(this, ThemedActivity.class);
        startActivity(intent);
    }

    public void startActionActivity(View view) {
        Intent intent = new Intent(this, ActionActivity.class);
        startActivity(intent);
    }
}
