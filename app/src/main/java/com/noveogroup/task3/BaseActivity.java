package com.noveogroup.task3;

import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class BaseActivity extends ActionBarActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.actions_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.action_attention:
                Toast.makeText(this, "Attention, please! You are in activity with action bar.",
                               Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_battery:
                Toast.makeText(this, "The battery is Ok.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_question:
                Toast.makeText(this, "What's up, Doc?", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return  super.onOptionsItemSelected(menuItem);
        }
    }
}
