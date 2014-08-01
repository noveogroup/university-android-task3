package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;

import com.noveogroup.task3.fragment.TextFragment;

public final class TabsActivity extends BaseActivity {

    public final static String SELECTED_TAB = "com.noveogroup.task3.SELECTED_TAB";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        for(int i = 1; i < getResources().getInteger(R.integer.tabs_quantity_minus_one); ++i) {
            ActionBar.Tab newTab = actionBar.newTab()
                    .setText(getString(R.string.tab_name) + i)
                    .setTabListener(new ActionBar.TabListener() {
                        private TextFragment textFragment;

                        @Override
                        public void onTabSelected(ActionBar.Tab tab,
                                                  FragmentTransaction fragmentTransaction) {

                            if(textFragment == null) {
                                textFragment = TextFragment.newInstance(getString(
                                                          R.string.some_more_text, tab.getText()));
                                fragmentTransaction.replace(android.R.id.content, textFragment);
                            }
                            else {
                                fragmentTransaction.attach(textFragment);
                            }
                        }

                        @Override
                        public void onTabUnselected(ActionBar.Tab tab,
                                                    FragmentTransaction fragmentTransaction) {
                            if(textFragment != null) {
                                fragmentTransaction.detach(textFragment);
                            }

                        }

                        @Override
                        public void onTabReselected(ActionBar.Tab tab,
                                                    FragmentTransaction fragmentTransaction) {

                        }
                    });
            actionBar.addTab(newTab);
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setSelectedNavigationItem(savedInstanceState
                                                            .getInt(SELECTED_TAB));
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(getSupportActionBar() != null) {
            outState.putInt(SELECTED_TAB, getSupportActionBar().getSelectedNavigationIndex());
        }
    }
}
