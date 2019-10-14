package com.gzd.basicserviceapplication;

import android.app.IntentService;
import android.content.Intent;

public class MyIntentService extends IntentService {
    public static final String ACTION_FOO = "com.gzd.basicserviceapplication.action.FOO";
    public static final String ACTION_BAZ = "com.gzd.basicserviceapplication.action.BAZ";

    public static final String EXTRA_PARAM1 = "com.gzd.basicserviceapplication.extra.PARAM1";
    public static final String EXTRA_PARAM2 = "com.gzd.basicserviceapplication.extra.PARAM2";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_FOO.equals(action)) {
                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
                handleActionFoo(param1, param2);
            } else if (ACTION_BAZ.equals(action)) {
                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
                handleActionBaz(param1, param2);
            }
        }
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleActionFoo(String param1, String param2) {
        // TODO: Handle action Foo
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionBaz(String param1, String param2) {
        // TODO: Handle action Baz
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
