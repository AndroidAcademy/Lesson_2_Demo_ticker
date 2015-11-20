package com.jonmal.ticker;

import android.app.Application;
import android.os.Handler;

public class MainApplication
		extends Application {

	//==============================================
	//              Fields
	//==============================================

	private static Handler mHandler;

	//==============================================
	//              Application Lifecycle
	//==============================================

	@Override
	public void onCreate() {
		super.onCreate();

		mHandler = new Handler();
	}

	//==============================================
	//              Public Static Methods
	//==============================================

	public static Handler getUIHandler() {
		return mHandler;
	}

}
