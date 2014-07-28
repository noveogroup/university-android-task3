package com.noveogroup.task3;


import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public abstract class AbsMenuActivity extends ActionBarActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String text = getResources().getString(R.string.menu_item_selected_format, item.getTitle());
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        return true;
    }
}
