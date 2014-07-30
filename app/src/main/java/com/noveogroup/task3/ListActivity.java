package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;

import com.noveogroup.task3.fragment.TextFragment;

public final class ListActivity extends BaseActivity {

    public final static String SELECTED_ITEM = "com.noveogroup.task3.SELECTED_ITEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        SpinnerAdapter spinnerAdapter = ArrayAdapter.createFromResource(this,
                                            R.array.string_array, R.layout.text_fragment_layout);

        actionBar.setListNavigationCallbacks(spinnerAdapter, new ActionBar.OnNavigationListener() {
            private String[] items = getResources().getStringArray(R.array.string_array);

            @Override
            public boolean onNavigationItemSelected(int position, long itemId) {
                TextFragment newFragment = TextFragment.newInstance(items[position]
                                                                          + " and some more text.");
                FragmentTransaction fragmentTransaction
                                                  = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(android.R.id.content, newFragment);
                fragmentTransaction.commit();

                return true;
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(getSupportActionBar() != null) {
            outState.putInt(SELECTED_ITEM, getSupportActionBar().getSelectedNavigationIndex());
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setSelectedNavigationItem(savedInstanceState
                    .getInt(SELECTED_ITEM));
        }
    }
}
