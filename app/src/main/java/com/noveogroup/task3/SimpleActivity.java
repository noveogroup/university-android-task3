package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

public final class SimpleActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);

        final Button showHideButton = (Button) findViewById(R.id.show_hide_button);
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
}
