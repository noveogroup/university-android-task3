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
                Toast.makeText(this, R.string.action_attention_result, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_battery:
                Toast.makeText(this, R.string.action_battery_result, Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_question:
                Toast.makeText(this, R.string.action_question_result, Toast.LENGTH_SHORT).show();
                return true;
            default:
                return  super.onOptionsItemSelected(menuItem);
        }
    }
}
