package com.example.alarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyAlarm extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {


        Log.d("MyAlarm", "Alarm just set");
    }

}