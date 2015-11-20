package com.jonmal.ticker;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity
		extends ActionBarActivity {

	//==============================================
	//              Constants
	//==============================================

	private static final int TICK_DELAY = 1000;

	//==============================================
	//              Fields
	//==============================================

	private TextView countDownTV;

	private Runnable mTickRunnable;

	private int counter = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		countDownTV = (TextView) findViewById(R.id.countDownTv);

		mTickRunnable = new Runnable() {
			@Override
			public void run() {
				tick();
			}
		};

		MainApplication.getUIHandler()
		               .postDelayed(mTickRunnable, TICK_DELAY);
	}

	private void tick() {

		countDownTV.setText("" + counter);

		counter++;

		MainApplication.getUIHandler()
		               .postDelayed(mTickRunnable, TICK_DELAY);
	}


}
