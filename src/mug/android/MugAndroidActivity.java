package mug.android;

import mug.js.JSObject;
import mug.modules.java.JSJavaObject;
import android.app.Activity;
import android.os.Bundle;

public class MugAndroidActivity extends Activity {
	JSJavaObject wrapper;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // get creation listener
        String activityId = (savedInstanceState == null ? getIntent().getExtras() : savedInstanceState).getString("activityId");
        if (activityId == null)
        	this.finishActivity(1);
        JSObject listener = ((MugApplication) getApplicationContext()).getState(activityId);
        if (listener == null)
        	this.finishActivity(2);
        
        // create new JSJavaObject
        wrapper = new JSJavaObject(listener.getProto(), this);
        for (String key : listener.getKeys())
        	wrapper.set(key, listener.get(key));
        
    	try {
    		((JSObject) wrapper.get("onCreate")).invoke(this);
    	} catch (Exception e) {
    	}
    }
    
    protected void onStart() {
    	super.onStart();
    	try {
    		((JSObject) wrapper.get("onStart")).invoke(wrapper);
    	} catch (Exception e) {
    	}
    }
    
    protected void onRestart() {
    	super.onRestart();
    	try {
    		((JSObject) wrapper.get("onRestart")).invoke(wrapper);
    	} catch (Exception e) {
    	}
    }
    
    protected void onResume() {
    	super.onResume();
    	try {
    		((JSObject) wrapper.get("onResume")).invoke(wrapper);
    	} catch (Exception e) {
    	}
    }
    
    protected void onPause() {
    	super.onPause();
    	try {
    		((JSObject) wrapper.get("onPause")).invoke(wrapper);
    	} catch (Exception e) {
    	}
    }
    
    protected void onStop() {
    	super.onStop();
    	try {
    		((JSObject) wrapper.get("onStop")).invoke(wrapper);
    	} catch (Exception e) {
    	}
    }
    
    protected void onDestroy() {
    	super.onDestroy();
    	try {
    		((JSObject) wrapper.get("onDestroy")).invoke(wrapper);
    	} catch (Exception e) {
    	}
    }
}