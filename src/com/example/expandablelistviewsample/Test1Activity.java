package com.example.expandablelistviewsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Test1Activity extends Activity implements View.OnClickListener {

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test1);

		Intent intent = getIntent();

		String name = intent.getStringExtra("name");

		TextView tv = (TextView)findViewById(R.id.test1);
		tv.setText(name);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

	}

}
