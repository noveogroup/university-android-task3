package com.noveogroup.task3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class RootActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_root);
	}

	public void simpleActionBarBtn(View view) {
		startActivity(new Intent(this, SimpleActionBarActivity.class));
	}

	public void upActionBarBtn(View view) {
		startActivity(new Intent(this, UpActionBarActivity.class));
	}

	public void splitActionBarBtn(View view) {
		startActivity(new Intent(this, SplitActionBarActivity.class));
	}

	public void navigationTabsActionBarBtn(View view) {
		startActivity(new Intent(this, NavigationTabsActionBarActivity.class));
	}

	public void navigationListActionBarBtn(View view) {
		startActivity(new Intent(this, NavigationListActionBarActivity.class));
	}

	public void customViewActionBarBtn(View view) {
		startActivity(new Intent(this, CustomViewActionBarActivity.class));
	}

	public void dummy(View view) {
		Toast.makeText(this, R.string.dragon, Toast.LENGTH_SHORT).show();
	}
}
