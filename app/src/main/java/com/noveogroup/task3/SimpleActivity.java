package com.noveogroup.task3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SimpleActivity extends BaseActivity {

    public final static String IS_AB_SHOWN = "com.noveogroup.task3.IS_AB_SHOWN";

    private Button showHideButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_layout);

        showHideButton = (Button) findViewById(R.id.show_hide_button);
        showHideButton.setText(R.string.hide_action_bar);
        showHideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getSupportActionBar() != null) {
                    if(showHideButton.getText() == getString(R.string.hide_action_bar)) {
                        getSupportActionBar().hide();
                        showHideButton.setText(R.string.show_action_bar);
                    }
                    else {
                        getSupportActionBar().show();
                        showHideButton.setText(R.string.hide_action_bar);
                    }
                }
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(IS_AB_SHOWN, showHideButton.getText().toString().equals(
                                                        getString(R.string.hide_action_bar)));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(!savedInstanceState.getBoolean(IS_AB_SHOWN)) {
            showHideButton.performClick();
        }
    }
}
