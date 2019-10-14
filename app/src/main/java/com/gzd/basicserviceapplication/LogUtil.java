package com.gzd.basicserviceapplication;

import android.content.Context;
import android.util.Log;

public class LogUtil {
    public static final String TAG = "LogUtil";
    public static void log(Context context, String content) {
        Log.e(TAG, "log: " + content );
    }
}
