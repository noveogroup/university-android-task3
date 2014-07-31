package com.noveogroup.task3;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionViewActivity extends ActionBarActivity {
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_view);
        actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_view, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);

        MenuItemCompat.setOnActionExpandListener(searchItem, new MenuItemCompat.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean ret;
        switch (item.getItemId()) {
            case R.id.hello_item:
                ret = true;
                Toast.makeText(this, R.string.toast_text_hello, Toast.LENGTH_LONG).show();
                break;
            case  R.id.world_item:
                ret = true;
                Toast.makeText(this, R.string.toast_text_world,Toast.LENGTH_LONG).show();
                break;
            case R.id.about_item:
                ret = true;
                Toast.makeText(this, R.string.toast_text_about,Toast.LENGTH_LONG).show();
                break;
            default:
                ret = super.onOptionsItemSelected(item);
        }
        return ret;
    }
}
