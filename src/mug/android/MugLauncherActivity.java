package mug.android;

import mug.Modules;
import mug.js.JSFunction;
import mug.js.JSObject;
import mug.modules.java.JSJavaObject;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MugLauncherActivity extends ActivityProxy {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // run script and get listener
        try {
        	JSObject test = Modules.getModule("main").load();
			listener = (ActivityListener) ((JSJavaObject) ((JSFunction) test.get("getMainActivity")).invoke(null)).javaObject;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// onCreate listener
		listener.onCreate(this, savedInstanceState);
    }
}