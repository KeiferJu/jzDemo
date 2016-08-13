package com.example.jzdemo;

import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings.System;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	private NiceLoadingView niceLoading;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		niceLoading = (NiceLoadingView) findViewById(R.id.nice_loading);

		test();
		

	}

	private void test() {
		niceLoading.start();
		new Thread(){
			public void run() {
				SystemClock.sleep(5000);
				niceLoading.success();
			};
		}.start();
		
		//niceLoading.failed();
	}


}
