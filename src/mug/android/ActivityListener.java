package mug.android;

import android.app.Activity;
import android.os.Bundle;

interface ActivityListener {
    void onCreate(Activity activity, Bundle savedInstanceState);
    void onStart(Activity activity);
    void onRestart(Activity activity);
    void onResume(Activity activity);
    void onPause(Activity activity);
    void onStop(Activity activity);
    void onDestroy(Activity activity);
}
