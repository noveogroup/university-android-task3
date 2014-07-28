package com.noveogroup.task3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class RootActivity extends ActionBarActivity {

    private static final Class<?>[] ACTIVITIES = {
            SimpleActivity.class,
            UpActivity.class,
            SplitActivity.class,
            TabNavigationActivity.class,
            ListNavigationActivity.class,
            CustomViewActivity.class,
            ThemeActivity.class,
            ActionViewActivity.class
    };

    private ViewGroup mButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_root);
        mButtons = (ViewGroup)findViewById(R.id.buttons);
    }

    public void dummy(View view) {
        Class<?> cls = ACTIVITIES[mButtons.indexOfChild(view)];
        startActivity(new Intent(this, cls));
    }
}
