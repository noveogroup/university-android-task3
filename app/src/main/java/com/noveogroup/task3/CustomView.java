package com.noveogroup.task3;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class CustomView extends ActionBarActivity {
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);
        actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.search, null);
        actionBar.setCustomView(v);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean ret;
        switch (item.getItemId()) {
            case R.id.hello_item:
                ret = true;
                Toast.makeText(this, "This is Hello item", Toast.LENGTH_LONG).show();
                break;
            case  R.id.world_item:
                ret = true;
                Toast.makeText(this, "This is World item",Toast.LENGTH_LONG).show();
                break;
            case R.id.about_item:
                ret = true;
                Toast.makeText(this, "This is About item",Toast.LENGTH_LONG).show();
                break;
            default:
                ret = super.onOptionsItemSelected(item);
        }
        return ret;
    }
}
