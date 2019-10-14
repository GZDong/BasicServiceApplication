package com.gzd.basicserviceapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

import androidx.annotation.Nullable;

public class BindService extends Service {
    public BindService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        LogUtil.log(BindService.this, "onBind");
        return new MyBinder();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.log(BindService.this, "bind service onCreate");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        LogUtil.log(BindService.this, "onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        LogUtil.log(BindService.this, "bind service onDestroy");
        super.onDestroy();
    }

    public class MyBinder extends Binder {
        public void myBinderMethod(String data) {
            LogUtil.log(BindService.this, data);
        }
    }
}
