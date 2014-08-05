package com.noveogroup.task3;

import android.content.Context;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

public class ActionBarWithActionViewActivity extends SimpleActionBarActivity {

    private static final String KEY_SEARCH = "SEARCH";
    private SearchView searchView;
    private String currentQuery = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_with_action_view);
        getSupportActionBar().setTitle(R.string.app_name);
        if (savedInstanceState != null) {
            currentQuery = savedInstanceState.getString(KEY_SEARCH);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar_with_action_view, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        searchView = (SearchView)MenuItemCompat.getActionView(searchItem);
        if (currentQuery != null) {
            MenuItemCompat.expandActionView(searchItem);
            searchView.setQuery(currentQuery, false);
            currentQuery = null;
        }
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
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(searchView.getWindowToken(), 0);
                Toast.makeText(ActionBarWithActionViewActivity.this, s, Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_SEARCH, searchView.getQuery().toString());
    }
}
