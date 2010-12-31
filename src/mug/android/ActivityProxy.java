package mug.android;

import android.app.Activity;
import android.os.Bundle;

abstract class ActivityProxy extends Activity {
	ActivityListener listener;
	
    protected void onCreate(Activity activity, Bundle savedInstanceState) { listener.onCreate(activity, savedInstanceState); }
    protected void onStart(Activity activity) { listener.onStart(activity); }
    protected void onRestart(Activity activity) { listener.onRestart(activity); }
    protected void onResume(Activity activity) { listener.onResume(activity); }
    protected void onPause(Activity activity) { listener.onPause(activity); }
    protected void onStop(Activity activity) { listener.onStop(activity); }
    protected void onDestroy(Activity activity) { listener.onDestroy(activity); }
}
