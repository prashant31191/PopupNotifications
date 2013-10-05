package com.bun.popupnotificationsfree;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class NotificationReceiver extends BroadcastReceiver{
	
	public static String ACTION_NOTIFICATION_CHANGED = "com.bun.popupnotificationfree.NOTIFICATION_CHANGED";

    @Override
    public void onReceive(Context context, Intent intent) {
    	Log.v("Broadcast recevier", "entered into receiver");
    }
}
