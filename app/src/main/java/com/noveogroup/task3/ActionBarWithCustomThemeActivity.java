package com.noveogroup.task3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

import com.noveogroup.task3.R;

public class ActionBarWithCustomThemeActivity extends SimpleActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //supportRequestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_action_bar_with_custom_theme);
        getSupportActionBar().setTitle(R.string.app_name);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar_with_custom_theme, menu);
        return true;
    }
}
