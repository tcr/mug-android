package mug.android;

import java.util.UUID;

import mug.Modules;
import mug.js.JSFunction;
import mug.js.JSObject;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MugLauncherActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // run script and get listener
        try {
        	JSObject test = Modules.getModule("main").load();
			JSObject listener = (JSObject) ((JSFunction) test.get("getMainActivity")).invoke(null);
			
			// save to state
			String activityId = UUID.randomUUID().toString();
			((MugApplication) getApplicationContext()).putState(activityId, listener);
        	
			// mug android activity
            Intent i = new Intent();
            i.setClass(MugLauncherActivity.this, MugAndroidActivity.class);
            i.putExtra("activityId", activityId);
            startActivity(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        // end this activity
        finish();
    }
}