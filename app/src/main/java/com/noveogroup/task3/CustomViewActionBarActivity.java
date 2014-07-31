package com.noveogroup.task3;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class CustomViewActionBarActivity extends Task2ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_action_bar);
		getSupportActionBar().setCustomView(R.layout.view_action_bar_custom);
		View customView = getSupportActionBar().getCustomView();
		Button button = (Button) customView.findViewById(R.id.write_btn);
		final EditText editText = (EditText) customView.findViewById(R.id.editText);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (getCurrentFocus() != null) {
					((InputMethodManager) getSystemService(INPUT_METHOD_SERVICE)).
							hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
				}
				Toast.makeText(CustomViewActionBarActivity.this,
						editText.getText().toString(), Toast.LENGTH_SHORT).show();
			}
		});
		getSupportActionBar().setDisplayShowCustomEnabled(true);
		getSupportActionBar().setDisplayShowHomeEnabled(false);
		getSupportActionBar().setDisplayShowTitleEnabled(false);
	}
}
